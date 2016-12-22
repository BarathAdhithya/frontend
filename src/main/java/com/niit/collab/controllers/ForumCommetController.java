package com.niit.collab.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.collab.DAO.*;
import com.niit.collab.model.*;



@RestController
public class ForumCommetController {

	@Autowired
	private ForumCommetDAO forumCommetDAO;
	
	@PostMapping(value="/commetforum/{fid}")
	public ResponseEntity<ForumCommet> forumcommet(@RequestBody ForumCommet forumcommet,HttpSession session,@PathVariable("fid") int fid){
		int uid=(Integer) session.getAttribute("uid");
		forumcommet.setForumid(fid);
		forumcommet.setUserid(uid);
		forumcommet.setCommettime(new Date());
		forumCommetDAO.save(forumcommet);
		return new ResponseEntity<ForumCommet>(forumcommet,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getforumcommet/{fid}")
	public ResponseEntity<List<ForumCommet>> getcommet(@PathVariable("fid") int fid){
		List<ForumCommet> commets =forumCommetDAO.list(fid);
		return new ResponseEntity<List<ForumCommet>>(commets,HttpStatus.OK);
	}
}
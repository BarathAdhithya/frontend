/*package com.niit.collab.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.collab.DAO.BlogRatingDAO;
import com.niit.collab.model.BlogRating;
import com.niit.collab.model.Users;

@RestController

public class BlogRatingController 

{
	@Autowired
	
	private BlogRatingDAO blogRatingDAO;
	
	HttpSession session;
	
	private Users users;
	
	@RequestMapping(value="/blogRating",method=RequestMethod.POST)
	
	public void createblog(@RequestBody BlogRating blogRating,HttpSession Httpsession)
	
	{
		
		int uid=(Integer)session.getAttribute("uid");
		
		blogRating.setUserid(uid);
	
		
		
		blogRatingDAO.saveOrUpdate(blogRating);
	
	}
	

	

}
*/
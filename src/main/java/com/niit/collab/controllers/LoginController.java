   package com.niit.collab.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.niit.collab.DAO.UsersDAO;
import com.niit.collab.model.Users;

@RestController

public class LoginController

{

	@Autowired
	
	UsersDAO usersDAO;
	
	@RequestMapping(value="/login/{username}/{password}" ,method=RequestMethod.GET)
	public 	ResponseEntity<Users>login(@PathVariable("username")String username,@PathVariable("password")String password ,HttpSession session)
	{
		Users users=usersDAO.authuser(username, password);
		if(users==null)
		{
			return null;
		}
		else
		{
			session.setAttribute("userLogged", users);
			session.setAttribute("uid",users.getId() );
			session.setAttribute("username", users.getUsername());
			users.setStatus('o');
			usersDAO.update(users);
			return new ResponseEntity<Users>(users,HttpStatus.OK);
		}
		
		
	}
	
	@RequestMapping(value="/logout" ,method=RequestMethod.POST)
	public ResponseEntity<Users> logout(HttpSession session)
	{
		int uid=(Integer) session.getAttribute("uid");
		Users users=usersDAO.logout(uid);
		users.setStatus('f');
		usersDAO.update(users);
		session.invalidate();
		
		
		
		return new ResponseEntity<Users>(users,HttpStatus.OK);
		
	}
	
	
	
	
	
}

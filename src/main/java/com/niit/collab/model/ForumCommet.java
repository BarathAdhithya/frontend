package com.niit.collab.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table
@Component
public class ForumCommet

{
    @Id
	@GeneratedValue
	private int id;
	private int userid;
	private int forumid;
	@Column(name="comments")
	private String commet;
	private Date commettime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getForumid() {
		return forumid;
	}
	public void setForumid(int forumid) {
		this.forumid = forumid;
	}
	public String getCommet() {
		return commet;
	}
	public void setCommet(String commet) {
		this.commet = commet;
	}
	public Date getCommettime() {
		return commettime;
	}
	public void setCommettime(Date commettime) {
		this.commettime = commettime;
	}
	
	
	
}
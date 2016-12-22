package com.niit.collab.DAO;

import java.util.List;

import com.niit.collab.model.ForumCommet;

public interface ForumCommetDAO

{

	public boolean save(ForumCommet forumCommet);
	public boolean update(ForumCommet forumCommet);
	public boolean delete(ForumCommet forumCommet);
	public List<ForumCommet> list(int fid);
	
	
}

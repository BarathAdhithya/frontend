package com.niit.collab.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.collab.model.ForumCommet;


@Repository
public class ForumCommetDAOImpl implements ForumCommetDAO

{

	@Autowired
	
	private SessionFactory sessionFactory;
	
	public ForumCommetDAOImpl(SessionFactory sessionFactory)
	{
	
		this.sessionFactory=sessionFactory;
	
	}
	
	@Transactional
	public boolean save(ForumCommet forumCommet)
	
	{
		try
		{
			sessionFactory.getCurrentSession().save(forumCommet);
			
			System.out.println("ForumCommet");
			
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			return false;
	
		}
	}
	
	@Transactional
	public boolean update(ForumCommet forumCommet) {
		try
		{
			sessionFactory.getCurrentSession().update(forumCommet);
			
			return true;
		}
		catch(Exception e)
		
		{
		
			e.printStackTrace();
			
			return false;
		}
	}
	
	@Transactional
	public boolean delete(ForumCommet forumCommet) {
		try
		{
			sessionFactory.getCurrentSession().delete(forumCommet);
			
			return true;
		}
		
		catch(Exception e)
		
		{
		
			e.printStackTrace();
			
			return false;
		
		}
	}
	
	/*@Transactional
	public List<ForumCommet> list(int fid) {
		
		Criteria c=sessionFactory.getCurrentSession().createCriteria(ForumCommet.class);
		c.add(Restrictions.eq("forumid", fid));
		List<ForumCommet> list=c.list();
		return list;
		
		
	}*/
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Transactional
	public List<ForumCommet> list(int fid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(ForumCommet.class);
		c.add(Restrictions.eq("forumid", fid));
		List<ForumCommet> list=c.list();
		return list;
	}

}

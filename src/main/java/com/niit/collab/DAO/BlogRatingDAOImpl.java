/*package com.niit.collab.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collab.model.BlogRating;

@Repository
public class BlogRatingDAOImpl implements BlogRatingDAO

{
	
	@Autowired
	
	private SessionFactory sessionFactory;

	
	
	@Transactional
	public void saveOrUpdate(BlogRating blogRating) {
		
	
				sessionFactory.getCurrentSession().saveOrUpdate(blogRating);
			
			
	}
	
	@Transactional
	public BlogRating getBlogRating(int bid, int uid) 
	
	{
		
		@SuppressWarnings("deprecation")
		Criteria c=sessionFactory.getCurrentSession().createCriteria(BlogRating.class);
		c.add(Restrictions.eq("bid",bid));
		c.add(Restrictions.eq("uid",uid));
		BlogRating blogRating=(BlogRating)c.uniqueResult();
				return blogRating;
	}

	@Transactional
	public List<BlogRating> getBlogs(int bid, int uid) {
		@SuppressWarnings("deprecation")
		Criteria c=sessionFactory.getCurrentSession().createCriteria(BlogRating.class);
		c.add(Restrictions.eq("bid",bid));
		c.add(Restrictions.eq("uid",uid));
		List<BlogRating> list=c.list();
		
				
		return list;
	}

	
	
	
	
	
}
*/
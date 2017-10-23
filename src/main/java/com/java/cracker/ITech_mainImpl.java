package com.java.cracker;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.cracker.model.Tech_main;

@Repository("iTech_mainImpl")
@Transactional
public class ITech_mainImpl {

	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}

	public List<Tech_main> findAll() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Tech_main").list();
	}

	public boolean save(Tech_main tech_main) {
		try {
			
		List<Tech_main> list = 	getSession().createCriteria(Tech_main.class)  
		      .add(Restrictions.eq("tm_technologies", tech_main.getTm_technologies()))  
		      .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();  
			 
		if(list.size()<=0 && tech_main.getTm_technologies().length()>0 && tech_main.getTm_technologies()!=null){
				getSession().save(tech_main);
			
			 return true;	
		}else{
			 return false;	
		}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	
	
	
	public Tech_main getTechnologyById(int id) {
		
		try {
			return getSession().get(Tech_main.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}

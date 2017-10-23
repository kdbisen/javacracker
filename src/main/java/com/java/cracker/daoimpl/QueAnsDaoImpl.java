package com.java.cracker.daoimpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.cracker.dao.QueAnsDao;
import com.java.cracker.model.QueAndAns;

@Repository("queAnsDao")
public class QueAnsDaoImpl implements QueAnsDao  {

	
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}
	

	@Override
	public List<QueAndAns> findAll() {
		
		 
		 List<QueAndAns>  list  = (List<QueAndAns>) getSession().createQuery("from QueAndAns").list();
		return list;
	}


	@Override
	public List<QueAndAns> findByTechnology(String technology) {
		 
		Criteria criteria = getSession().createCriteria(QueAndAns.class).add(Restrictions.eq("technology", technology));
		return (List<QueAndAns>) criteria.list();
		
		
		 
	}


	@Override
	public List<QueAndAns> findBySection(String section) {
		 List<QueAndAns>  list = getSession().createCriteria(QueAndAns.class).createCriteria(section).list(); 
		   
			return list;
	}


	@Override
	public boolean addQueAns(QueAndAns queAndAns) {

		try {

			getSession().save(queAndAns);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}


	@Override
	public List<QueAndAns> findByTechAndSection(String technology, String section) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(QueAndAns.class).add(Restrictions.eq("technology", technology)).add(Restrictions.eq("section", section));
		return (List<QueAndAns>) criteria.list();
		
	}

}

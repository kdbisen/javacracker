package com.java.cracker.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.cracker.dao.SectionDao;
import com.java.cracker.model.Section;
@Repository("sectionDao")
public class SectionDaoImpl implements SectionDao {

	@Autowired
    private SessionFactory sessionFactory;
     
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
	
    
	@Override
	public Section findById(int id) {
		 
		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Section.class).add(Restrictions.eq("id", id));
		return (Section) criteria.uniqueResult();
	}

	@Override
	public List<Section> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		return  (List<Section>)session.createCriteria(Section.class).list();
		   
		
	}

	@Override
	public List<Section> findByTechnology(String technology) {
		 
		
		System.out.println("-- - - -"+technology);
		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Section.class).add(Restrictions.eq("technology", technology));
		
		return  criteria.list();
	}


	@Override
	public boolean addSection(Section section) {
		try{
			Session session = this.sessionFactory.getCurrentSession();
			session.save(section);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

/*
	@Override
	public boolean addSection(Section section) {
		try{
			Session session = this.sessionFactory.getCurrentSession();
			session.save(section);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}
*/
}

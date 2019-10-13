package com.nit.persistence;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public CriteriaBuilder getCriteriaBuilder() {
		return getSession().getCriteriaBuilder();
	}
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
}

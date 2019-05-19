package springBootLearningwithDB.test.service;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootLearningwithDB.test.dao.BootDBLearningDao;



@Service
public class BootDBLearningService {
	
	
	
	@Autowired
	private BootDBLearningDao daoObject;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Transactional
	public String bootDBTest() {
		System.out.println("in service layer");
		return daoObject.bootDBTest(sessionFactory);
	}

}

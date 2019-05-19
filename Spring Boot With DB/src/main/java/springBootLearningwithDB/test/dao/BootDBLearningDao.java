package springBootLearningwithDB.test.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BootDBLearningDao {

	
	public String bootDBTest( SessionFactory sessionFactory) {
		
		System.out.println("in dao");
		String gender = (String) 
				sessionFactory.getCurrentSession().createSQLQuery("select sex from users where id = 1").uniqueResult();
		return gender;
		
		
	}
	
}

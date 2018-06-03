package hibernate.basic;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MyClient {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("\\hibernate\\basic\\hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session  = factory.openSession();
		
		Query query = session.createSQLQuery("CALL myproc()");
				
		System.out.println("PROCEDURE called--------->");
		query.executeUpdate();			
		Employee em = new Employee();
		em.setEid(20);
		em.setEname("Ramesh");
		em.setEsalary(120000);
		session.save(em);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	}

}

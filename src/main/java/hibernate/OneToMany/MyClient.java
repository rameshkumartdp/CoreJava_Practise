package hibernate.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MyClient {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(College.class);

		cfg.configure("\\hibernate\\OneToMany\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		College clg = new College();
		Student st = new Student();
		st.setSname("Sunny");
		st.setSroll("0000");
		st.setSid(222);
		st.setColl(clg);
		Student st1 = new Student();
		st1.setSname("Harry");
		st1.setSroll("0987");
		st1.setSid(345);
		st1.setColl(clg);
		clg.setCname("AITS");
		clg.setRegNo("1111");
		session.save(st);
		session.save(st1);
		session.save(clg);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	}

}

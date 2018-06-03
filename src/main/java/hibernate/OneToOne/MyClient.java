package hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MyClient {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Employee_Dtls.class);
		
		cfg.configure("\\hibernate\\OneToOne\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session  = factory.openSession();
		Employee em = new Employee();
		Employee_Dtls dtls = (Employee_Dtls)session.get(Employee_Dtls.class, new Integer(100));
		System.out.println("EMP--->  "+dtls.getEmp().getEname());
		session.close();
		factory.close();
	}

}

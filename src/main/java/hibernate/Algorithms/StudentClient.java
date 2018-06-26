package hibernate.Algorithms;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class StudentClient 
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ses = factory.openSession();
		StudentBean st1 = new StudentBean();

		//st1.setSid(13);
		st1.setSname("Fishy");
		st1.setTot_m(89);
		ses.save(st1);
		Transaction tx = ses.beginTransaction();

		tx.commit();
		ses.close();
		factory.close();

	}
}

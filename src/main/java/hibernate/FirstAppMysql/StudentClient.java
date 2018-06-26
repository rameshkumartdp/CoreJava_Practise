package hibernate.FirstAppMysql;


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

		/*st1.setSid(12);
		st1.setSname("Spike");
		st1.setTot_m(76);

		Transaction tx = ses.beginTransaction();
*/
		ses.load(st1, new Integer(12));
		//System.out.println(st1.getSname()+" record retrieved!");

/*		tx.commit();*/
		ses.close();
		factory.close();

	}
}

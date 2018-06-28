package hibernate.HQL;


import hibernate.Component.EmployeeBean;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

class EmployeeClient
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ses = factory.openSession();
		//Query query = ses.createQuery("select emp.name, emp.id from EmployeeBean as emp where emp.id > ? and emp.name != :tm ");
		Query query = ses.createQuery("update EmployeeBean as emp set emp.name=? where emp.name like :tm");
		//query.setInteger(0, 200);
		query.setString(0, "SHI");
		query.setString("tm", "Ramesh");
		query.executeUpdate();

		/*Iterator list = query.iterate();
		while(list.hasNext()) {

			System.out.println(list.next());
		}*/
		ses.close();
		factory.close();

	}
}

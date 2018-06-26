package hibernate.Composite;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class EmployeeClient
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.comp.cfg.xml").buildSessionFactory();
		Session ses = factory.openSession();
		EmployeeBean emp = new EmployeeBean();
		CompKey key = new CompKey();
		key.setEmpId(132228);
		key.setShortid(5244);
		emp.setName("Ramesh Kumar");
		emp.setDepartment("IT");
		emp.setKey(key);

		ses.save(emp);
		Transaction tx = ses.beginTransaction();

		tx.commit();
		ses.close();
		factory.close();

	}
}

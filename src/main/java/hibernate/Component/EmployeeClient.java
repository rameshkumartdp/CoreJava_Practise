package hibernate.Component;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class EmployeeClient
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ses = factory.openSession();
		EmployeeBean emp = new EmployeeBean();
		SalaryDetails detail = new SalaryDetails();
		detail.setSalary(123456);
		detail.setCompany("Sears");
		emp.setId(2695);
		emp.setName("Ramesh");
		emp.setDetails(detail);

		ses.save(emp);
		Transaction tx = ses.beginTransaction();

		tx.commit();
		ses.close();
		factory.close();

	}
}

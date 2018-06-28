package hibernate.CriteriaAPI;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;

class EmployeeClient
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernatect.cfg.xml").buildSessionFactory();
		Session ses = factory.openSession();
		Criteria ct = ses.createCriteria(EmployeeBean.class);
		Criterion ctn = Restrictions.ne("name", "CGI");
		ct.add(ctn);
		List list = ct.list();
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			EmployeeBean emp = (EmployeeBean) list.get(i);
			System.out.println("Values---> "+emp.getName());
		}
		ses.close();
		factory.close();

	}
}

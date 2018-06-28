package hibernate.annotations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

class StudentClient 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(StudentBean.class);
		cfg.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/test");
		cfg.setProperty("hibernate.connection.username", "ramesh");
		cfg.setProperty("hibernate.connection.password", "kumar");
		cfg.setProperty("show_sql", "true");

		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		StudentBean st1 = new StudentBean();
		st1 = (StudentBean) ses.get(StudentBean.class, new Integer(6));
		System.out.println(st1.getSname());


		ses.close();
		factory.close();

	}
}

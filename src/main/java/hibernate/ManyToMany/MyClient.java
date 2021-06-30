package hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyClient {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Delegate.class);
		cfg.addAnnotatedClass(Event.class);

		cfg.configure("\\hibernate\\ManyToMany\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Event event = new Event();
		event.setEname("Ramesh");
		Event event1 = new Event();
		event1.setEname("Kumar");
		Event event2 = new Event();
		event2.setEname("Kadapa");
		
		Delegate dlg = new Delegate();
		dlg.getEvent().add(event1);
		dlg.getEvent().add(event2);
		Delegate dlg1 = new Delegate();
		dlg1.getEvent().add(event2);
		dlg1.getEvent().add(event1);

		session.save(event1);
		session.save(event2);
		session.save(dlg);
		session.save(dlg1);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	}

}

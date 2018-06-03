package spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class  DemoInterImpl  
{
	private int id;
	private String  name;
	private int  marks;
	
	private SessionFactory sessionfactory;
	
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getDetails(){
		Session ses = sessionfactory.openSession();
		DemoInterImpl obj = (DemoInterImpl)ses.get(DemoInterImpl.class,new Integer(102));
		
		return obj.getName()+"    "+obj.getMarks();
	}
	
}
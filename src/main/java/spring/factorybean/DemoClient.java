package spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContextFactory.xml");
		Demo demo = (Demo) context.getBean("dem");
		Calendar cal = (Calendar) context.getBean("fact");
		System.out.println();
		System.out.println(demo.hashCode());
		System.out.println(cal.getFirstDayOfWeek());
	}
}

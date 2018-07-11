package spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContextAuto.xml");
		Demo demo = (Demo) context.getBean("dem");
		System.out.println();
		System.out.println("--> "+demo.getAuto().getAutoName());
	}
}

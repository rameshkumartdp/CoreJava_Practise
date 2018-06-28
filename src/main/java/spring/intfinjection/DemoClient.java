package spring.intfinjection;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContextIntf.xml");
		Demo demo = (Demo) context.getBean("dem");
		System.out.println();
		System.out.println(demo);
	}
}

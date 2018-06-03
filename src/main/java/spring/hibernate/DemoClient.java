package spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context = new FileSystemXmlApplicationContext("D:/WGP/workspace/Testing/src/spring/hibernate/spring.cfg.xml");
		DemoInterImpl d = (DemoInterImpl) context.getBean("di");
		System.out.println(d.getDetails());
		
	}
}

package spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo = (Demo) context.getBean("dem");
		System.out.println();
		System.out.println(demo.hashCode());
		Demo demo1 = (Demo) context.getBean("dem");
		System.out.println();
		System.out.println(demo1.hashCode());
	}
}

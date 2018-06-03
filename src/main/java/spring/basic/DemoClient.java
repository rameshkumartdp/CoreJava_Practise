package spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context = new FileSystemXmlApplicationContext("D:/WGP/workspace/Testing/src/spring/basic/spring.cfg.xml");
		String[] str = context.getBeanDefinitionNames();
		for(String s:context.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		// getting object of implementation class
		DemoInter d = (DemoInter) context.getBean("di");

		System.out.println(d.wish("friends"));
		
	}
}

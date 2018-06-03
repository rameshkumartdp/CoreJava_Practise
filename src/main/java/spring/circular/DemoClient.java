package spring.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DemoClient {
	public static void main(String args[]) {

		ApplicationContext context = new FileSystemXmlApplicationContext("D:/WGP/workspace/Testing/src/spring/circular/spring.cfg.xml");
		
		A d = (A) context.getBean("a");

		System.out.println("Excecuted------->   "+d.hashCode());
		
	}
}

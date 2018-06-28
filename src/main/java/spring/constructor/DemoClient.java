package spring.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Arrays;

public class DemoClient {
	public static void main(String args[]) {

		Resource res = new ClassPathResource("springcnst.cfg.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Demo dem  = (Demo) factory.getBean("dem");
		System.out.println();
		System.out.println(Arrays.toString(dem.getList().toArray()));
		System.out.println(dem.getSet());
		System.out.println(dem.getMap());
		System.out.println(dem.getProp());
	}
}

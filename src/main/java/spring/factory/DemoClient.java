package spring.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Arrays;

public class DemoClient {
	public static void main(String args[]) {

		Resource res = new ClassPathResource("springfact.cfg.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Demo dem  = (Demo) factory.getBean("dem");
		System.out.println();
		System.out.println(dem.getDetails().getCompany());
	}
}

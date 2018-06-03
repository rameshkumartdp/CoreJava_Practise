package spring.processor;

/*import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassPathResource res = new ClassPathResource("applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(res);*/
       	ApplicationContext  ctx = new FileSystemXmlApplicationContext("D:/WGP/workspace/Testing/src/spring/processor/applicationContext.xml");
		//Init i1 = (Init) ctx.getBean("in");

//		ctx.getBean("pro");

//				ctx.getBean("");
		
//		System.out.print(i1);		
	}

}

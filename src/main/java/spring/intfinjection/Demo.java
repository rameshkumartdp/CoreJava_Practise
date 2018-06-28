package spring.intfinjection;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Demo implements BeanNameAware, ApplicationContextAware {
	private String name;
	private ApplicationContext context;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) {
		this.context = context;
	}

	@Override
	public String toString(){
		return "beanName- "+name+" scope- "+context.isSingleton(name);
	}
}
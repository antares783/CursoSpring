package mx.com.antares.ejemplo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		
		Service service = beanFactory.getBean(Service.class);
		
		System.out.println(service.getMessage());
	}

}

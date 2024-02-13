package spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.config.ApplicationConfig;
import spring.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext IOC = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee bean = IOC.getBean(Employee.class);
		System.out.println(bean);
		
		Employee bean1 = IOC.getBean(Employee.class);
		System.out.println(bean1);
		
	}

}

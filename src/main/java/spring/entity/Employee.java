package spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee {
	private String name="Raman";
	private int id=101;
	
	@Autowired
	private Address address;
	
	public void turnOn() {
		System.out.println("Load System for employee");
	}
	public void turnOff() {
		System.out.println("close all programs for employee");
	}
}

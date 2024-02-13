package spring.entity;

import lombok.Data;

@Data
public class Address {

	private String city="Guntur";
	private String state="UP";
	
	public void turnOn() {
		System.out.println("Load System for Address");
	}
	public void turnOff() {
		System.out.println("close all programs for Address");
	}
}

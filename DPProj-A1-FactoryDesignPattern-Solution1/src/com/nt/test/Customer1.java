package com.nt.test;


import com.nt.component.Car;
import com.nt.factory.CarFactory;

public class Customer1 {

	public static void main(String[] args) {
		Car car1=CarFactory.getCar("baleno");
		System.out.println(car1);
	}

}
package com.nt.factory;

import com.nt.component.BalenorCar;
import com.nt.component.Car;
import com.nt.component.CarTyres;
import com.nt.component.ErtigaCar;
import com.nt.component.SwiftCar;

public class CarFactory {
	   //static factory method
		public static  Car getCar(String type) {
			  Car car=null;
			  //create CarTyres object
			  CarTyres tyres=new CarTyres();
			    if(type.equalsIgnoreCase("baleno")) {
			    	car=new BalenorCar(tyres);
			    }
			    else if(type.equalsIgnoreCase("swift")) {
			    	car=new SwiftCar(tyres);
			    }
			    else if(type.equalsIgnoreCase("ertiga")) {
			    	car=new ErtigaCar(tyres);
			    }
			    else {
			    	throw  new IllegalArgumentException("invalid car type");
			    }
			    car.assemble();
			    car.roadTest();
			    return car;
		}//method
	}//class
package com.java.oops;

public class Main {

	public static void main(String[] args) {

//		int x;//its a local var to main fn
//		System.out.println(x);// 10

//		car1 is object variables or reference variable
		Car car1 = new Car();// I am creating a Car object
		System.out.println(car1.color);
		System.out.println(car1.topSpeedInKmph);
		System.out.println(car1.mielage);
		System.out.println(car1.weightInKg);
		System.out.println(car1.engineCC);
		
		car1.color = "Red";
		car1.topSpeedInKmph = 180;
		car1.mielage = 15.9F;
		car1.weightInKg = 500;
		car1.engineCC = 2000;
		
		car1.color = "Pink";
		System.out.println(car1.color);
		System.out.println(car1.topSpeedInKmph);
		System.out.println(car1.mielage);
		System.out.println(car1.weightInKg);
		System.out.println(car1.engineCC);

		
		car1.accelerate();
		car1.breaks();
		
		
		System.out.println(car1);// ? hashCode: 7960847b hexadecimal [0-9 A-F]  format
		System.out.println(car1.hashCode());//2036368507 hashCode() is for every object
		
		
		Car car2 = new Car();// I am creating a Car object
		System.out.println(car2.color);
		System.out.println(car2.topSpeedInKmph);
		System.out.println(car2.mielage);
		System.out.println(car2.weightInKg);
		System.out.println(car2.engineCC);
		
		car2.color = "Blue";
		System.out.println(car2.color);//?blue
		System.out.println(car1.color);//?pink
		System.out.println(car2);// ? hashCode: 5c8da962 hexadecimal [0-9 A-F]  format

		
		Car car3 = null;
		car3 = car2;
		car2 = null;
		
		System.out.println(car3.color);//
		System.out.println(car2.color);
	}

}

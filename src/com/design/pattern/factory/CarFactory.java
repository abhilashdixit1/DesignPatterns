package com.design.pattern.factory;

public class CarFactory {
	
	public static CarType getCarType(String str) {
		switch (str) {
		case "sedan":
			return new Sedan();
		case "hatchback":
			return new HatchBack();
		default:
			return new SUV();
		}
					
	}

}

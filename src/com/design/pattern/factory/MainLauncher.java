package com.design.pattern.factory;

public class MainLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		CarType sedan = CarFactory.getCarType("sedan");
		sedan.spec();
		
		CarType hatchBack = CarFactory.getCarType("hatchback");
		hatchBack.spec();
		
		CarType suv = CarFactory.getCarType("");
		suv.spec();
				
		

	}

}

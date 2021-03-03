package com.design.pattern.singleton;

public class SingletonEager {
	
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("Hello Eager");
	}

}

package com.design.pattern.singleton;

public class SingletonThreadSafeMethod {
	
	private static SingletonThreadSafeMethod instance;
	
	private SingletonThreadSafeMethod() {}
	
	public static synchronized SingletonThreadSafeMethod getInstance() {
		if(instance==null) {
			instance=new SingletonThreadSafeMethod();
		}
		
		return instance;
	}

}

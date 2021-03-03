package com.design.pattern.singleton;

public class SingletonThreadSafeBlock {
	
	private static SingletonThreadSafeBlock instance;
	
	private SingletonThreadSafeBlock() {}
	
	public static SingletonThreadSafeBlock getInstance() {
		if(instance==null) {
			synchronized (SingletonThreadSafeBlock.class) {
				instance= new SingletonThreadSafeBlock();
			}
		}
		
		return instance;
	}

}

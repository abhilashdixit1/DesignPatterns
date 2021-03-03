package com.design.pattern.singleton;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonEager singletonEager = SingletonEager.getInstance();
		System.out.println(singletonEager);
		
		SingletonEager singletonEager2 = SingletonEager.getInstance();
		System.out.println(singletonEager2);
		
		singletonEager.sayHello();
		
		
		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		System.out.println(singletonLazy);
		
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		System.out.println(singletonLazy2);
		
		SingletonThreadSafeMethod singletonThreadSafeMethod= SingletonThreadSafeMethod.getInstance();
		System.out.println(singletonThreadSafeMethod);
		
		SingletonThreadSafeMethod singletonThreadSafeMethod2= SingletonThreadSafeMethod.getInstance();
		System.out.println(singletonThreadSafeMethod2);
		
		
		SingletonThreadSafeBlock singletonThreadSafeBlock = SingletonThreadSafeBlock.getInstance();
		System.out.println(singletonThreadSafeBlock);
		
		SingletonThreadSafeBlock singletonThreadSafeBlock2 = SingletonThreadSafeBlock.getInstance();
		System.out.println(singletonThreadSafeBlock2);

	}

}

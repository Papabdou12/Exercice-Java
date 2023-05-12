package com.saraya1;

public class Greetings {

	void greeting() {
		//System.out.println("Hello my dear, I'm 28");
		greeting("my dear");
	}
	
	void greeting(String name) {
		//System.out.printf("Hello %s, I'm 28",name).println();
		greeting(name,28);
	}
	
	void greeting(String name, int age) {
		System.out.printf("Hello %s, I'm %d", name,age).println();
		
	}
}

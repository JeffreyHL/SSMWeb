package helloWorld.spring.bean.impl;

import helloWorld.spring.bean.IAnimals;

public class Dog implements IAnimals {

	@Override
	public void Call() {
		System.out.println("汪汪汪...");
	}

}

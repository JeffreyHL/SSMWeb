package helloWorld.spring.bean.impl;

import helloWorld.spring.bean.IAnimals;

public class Cat implements IAnimals {

	@Override
	public void Call() {
		System.out.println("喵...喵...喵...");
	}

}

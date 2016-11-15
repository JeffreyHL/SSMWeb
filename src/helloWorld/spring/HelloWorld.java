package helloWorld.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloWorld.spring.bean.BoxIn;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello, Spring!");
		
//		BoxIn box = (BoxIn) context.getBean("dog");
//		box.getAnimal().Call(); // java.lang.NullPointerException

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/helloWorld/spring/context.xml");
		BoxIn box = (BoxIn) context.getBean("box");
		box.getAnimal().Call(); 
		
	}

}

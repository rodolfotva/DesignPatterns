package abstractFactory.impl;

import abstractFactory.interfaces.Shape;

public class Circle implements Shape{

	public void draw() {
		System.out.println("Inside circle draw method");
	}
}

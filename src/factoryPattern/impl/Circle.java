package factoryPattern.impl;

import factoryPattern.interfaces.Shape;

public class Circle implements Shape{

	public void draw() {
		System.out.println("Inside circle draw method");
	}
}

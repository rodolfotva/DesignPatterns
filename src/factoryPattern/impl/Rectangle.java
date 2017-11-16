package factoryPattern.impl;

import factoryPattern.interfaces.Shape;

public class Rectangle implements Shape{

	public void draw() {
		System.out.println("Inside Rectangle shape draw methods");
	}
}

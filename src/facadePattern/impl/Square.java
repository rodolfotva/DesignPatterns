package facadePattern.impl;

import facadePattern.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing " + this.getClass().getSimpleName());
	}

}

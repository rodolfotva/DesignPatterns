package decoratorPattern.implementations;

import decoratorPattern.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing " + this.getClass().getSimpleName());
	}

}

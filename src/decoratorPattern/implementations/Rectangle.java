package decoratorPattern.implementations;

import decoratorPattern.interfaces.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing " + this.getClass().getSimpleName());
	}

}

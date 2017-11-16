package decoratorPattern.abstraction;

import decoratorPattern.interfaces.Shape;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoretesShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoretesShape = decoratedShape;
	}
	
	public void draw() {
		decoretesShape.draw();
	}

}

package decoratorPattern.implementations;

import decoratorPattern.abstraction.ShapeDecorator;
import decoratorPattern.interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoretesShape.draw();
		setRedBorder(decoretesShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color Red");
	}

}

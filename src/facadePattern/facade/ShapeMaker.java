package facadePattern.facade;

import facadePattern.impl.Circle;
import facadePattern.impl.Rectangle;
import facadePattern.impl.Square;
import facadePattern.interfaces.Shape;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	
}

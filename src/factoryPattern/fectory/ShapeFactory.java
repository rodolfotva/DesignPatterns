package factoryPattern.fectory;

import factoryPattern.impl.Circle;
import factoryPattern.impl.Rectangle;
import factoryPattern.impl.Square;
import factoryPattern.interfaces.Shape;

public class ShapeFactory {

  public Shape getShape(String shapeType){
    if(shapeType == null){
      return null;
    }	
    
    if(shapeType.equalsIgnoreCase("CIRCLE")){
      return new Circle();
    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
      return new Rectangle();
    } else if(shapeType.equalsIgnoreCase("SQUARE")){
      return new Square();
    }
    	       
    return null;
  }
}

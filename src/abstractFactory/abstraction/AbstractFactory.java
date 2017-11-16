package abstractFactory.abstraction;

import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

public abstract class AbstractFactory {
   abstract public Color getColor(String color);
   abstract public Shape getShape(String shape) ;
}

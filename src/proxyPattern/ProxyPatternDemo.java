package proxyPattern;

import proxyPattern.impl.ProxyImage;
import proxyPattern.interf.Image;

/**
 * In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 * like a fake singleton
 * 
 * @author RAlquezar
 *
 */
public class ProxyPatternDemo {
	
	public static void main(String... strings) {
		Image image = new ProxyImage("test_10mb.jpg");

		//image will be loaded from disk
		image.display(); 
		System.out.println("");

		//image will not be loaded from disk
		image.display(); 		
	}

}

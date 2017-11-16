package bridgePattern.bridges;

import bridgePattern.interfaces.DrawAPI;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw a circle green with radius " + radius + " and metric X " + x + "and Y " + y);
	}

}

package bridgePattern.bridges;

import bridgePattern.interfaces.DrawAPI;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw a circle red with radius " + radius + " and metric X " + x + "and Y " + y);
	}

}

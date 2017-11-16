package builderPattern.impl;

public class ChickenBurger extends Burger{

	@Override
	public Double price() {
		return new Double(15.00);
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}

}

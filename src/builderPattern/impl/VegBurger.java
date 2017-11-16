package builderPattern.impl;

public class VegBurger extends Burger {

	@Override
	public Double price() {
		return new Double(12.50);
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}

}

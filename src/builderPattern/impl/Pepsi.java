package builderPattern.impl;

public class Pepsi extends ColdDrink {

	@Override
	public Double price() {
		return new Double(2.90);
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}

}

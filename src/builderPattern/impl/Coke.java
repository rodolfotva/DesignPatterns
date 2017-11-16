package builderPattern.impl;

public class Coke extends ColdDrink {

	@Override
	public Double price() {
		return new Double(3.00);
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}

}

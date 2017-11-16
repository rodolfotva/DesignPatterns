package builderPattern.impl;

import builderPattern.interfaces.Item;
import builderPattern.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract Double price();

}

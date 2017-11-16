package builderPattern.impl;

import builderPattern.interfaces.Item;
import builderPattern.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract Double price();

}

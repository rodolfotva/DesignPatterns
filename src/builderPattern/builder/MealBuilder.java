package builderPattern.builder;

import builderPattern.impl.ChickenBurger;
import builderPattern.impl.Coke;
import builderPattern.impl.Meal;
import builderPattern.impl.Pepsi;
import builderPattern.impl.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}   

	public Meal prepareNonVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}

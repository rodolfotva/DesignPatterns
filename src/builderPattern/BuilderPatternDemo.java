package builderPattern;

import builderPattern.builder.MealBuilder;
import builderPattern.impl.Meal;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		   
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItens();
		System.out.println("Total Cost: " + vegMeal.getPrice());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItens();
		System.out.println("Total Cost: " + nonVegMeal.getPrice());
	}
}

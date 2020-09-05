package in.jk.dessignpatterns.builder;

public class MealBuilder {

	public static Meal mealBuilder() {

		Meal meal = new Meal();

		VegBurger vegBurger = new VegBurger();
		NonVegBurger nonVegBurger = new NonVegBurger();
		Pepsi pepsi = new Pepsi();
		Coffie coffie = new Coffie();
		
		meal.addItem(vegBurger);
		meal.addItem(nonVegBurger);
		meal.addItem(coffie);
		meal.addItem(pepsi);
		return meal;

	}

}

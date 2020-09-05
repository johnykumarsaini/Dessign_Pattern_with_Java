package in.jk.dessignpatterns.builder;

import java.util.List;

public class BuilderDessignPatterns {

	public static void main(String[] args) {

		Meal meal = MealBuilder.mealBuilder();
		List<Item>mealItem = meal.items;
		
		System.out.println("All Meal Item :: ");
		for (Item item : mealItem) {
			
			System.out.println("Item Name :: "+item.name() +" Item Price :: "+ item.price());
		}
		
		
		System.out.println();
		System.out.println("Total Price :: "+meal.totalPrice());

	}

}

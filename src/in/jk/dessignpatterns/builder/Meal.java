package in.jk.dessignpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {

		items.add(item);
	}

	public void showMealItems() {

		for (Item item : items) {
			System.out.println("Name :: " + item.name() + " Price ::" + item.price());

		}
	}
	
	
	public float totalPrice() {
		
		float price = 0.0f;
		for (Item item : items) {
			
			price+= item.price();
		}
		return price;
	}

}

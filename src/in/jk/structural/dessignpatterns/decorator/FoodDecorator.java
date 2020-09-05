package in.jk.structural.dessignpatterns.decorator;

public class FoodDecorator implements Food {

	private Food food;

	public FoodDecorator(Food food) {

		this.food = food;
	}

	@Override
	public String prepareFood() {

		return food.prepareFood();
	}

	@Override
	public float price() {

		return food.price();
	}

}

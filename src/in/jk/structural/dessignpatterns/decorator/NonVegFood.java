package in.jk.structural.dessignpatterns.decorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food food) {
		super(food);
	}
	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Chiken Curry with Roti ";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 250;
	}

}

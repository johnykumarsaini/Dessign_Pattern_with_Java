package in.jk.structural.dessignpatterns.decorator;

public class ExtraNonVegFood extends FoodDecorator {

	public ExtraNonVegFood(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+" and Rice ";
	}

	@Override
	public float price() {
		return super.price()+50;
	}

}

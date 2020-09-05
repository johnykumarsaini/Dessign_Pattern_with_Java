package in.jk.dessignpatterns.builder;

public class NonVegBurger extends Burger {

	@Override
	public String name() {
		return "Non Veg Burger :: Chicken Mix";
	}

	@Override
	public float price() {
		
		return 199;
	}

}

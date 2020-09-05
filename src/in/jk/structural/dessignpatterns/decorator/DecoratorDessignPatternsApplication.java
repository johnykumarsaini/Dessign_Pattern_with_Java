package in.jk.structural.dessignpatterns.decorator;

public class DecoratorDessignPatternsApplication {

	public static void main(String[] args) {

		Food vegFood = new VegFood();
		System.out.println(vegFood.prepareFood());
		System.out.println(vegFood.price());

		Food nonVegFood = new NonVegFood(vegFood);
		System.out.println();
		System.out.println(nonVegFood.prepareFood());
		System.out.println(nonVegFood.price());

		Food extranonVegFood = new ExtraNonVegFood(nonVegFood);
		System.out.println();
		System.out.println(extranonVegFood.prepareFood());
		System.out.println(extranonVegFood.price());

	}

}

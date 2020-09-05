package in.jk.structural.dessignpatterns.flyweight;

public class FlyWeightDessignPatternsApplication {

	public static void main(String[] args) {

		MobileFactory mobileFactory = new MobileFactory();
        mobileFactory.getMobile().entrySet().stream().forEach(System.out::println);
	}

}

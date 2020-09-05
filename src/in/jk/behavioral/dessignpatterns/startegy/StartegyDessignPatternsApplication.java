package in.jk.behavioral.dessignpatterns.startegy;

public class StartegyDessignPatternsApplication {

	public static void main(String[] args) {

		Context context = null;

		context = new Context(new AddtionStartegy());
		context.calcuate(10, 10);
		
		
		context = new Context(new SubstrationStartegy());
		context.calcuate(50, 20);

	}

}

package in.jk.behavioral.dessignpatterns.template;

public class Chase implements Game {

	@Override
	public void start() {

		System.out.println("Chase Game is start ....");
	}

	@Override
	public void play() {
		start();
		System.out.println("Chase Game is playing ....");
		end(); 
	}

	@Override
	public void end() {
		System.out.println("Chase Game is end ....");
	}

}

package in.jk.behavioral.dessignpatterns.template;

public class Soccar implements Game {

	@Override
	public void start() {

		System.out.println("Soccar Game is start ....");
	}

	@Override
	public void play() {

		start();
		System.out.println("Soccar Game is playing ....");
		end();
	}

	@Override
	public void end() {
		System.out.println("Soccar Game is end ....");
	}

}

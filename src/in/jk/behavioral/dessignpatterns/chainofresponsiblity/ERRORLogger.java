package in.jk.behavioral.dessignpatterns.chainofresponsiblity;

public class ERRORLogger extends Logger {

	public ERRORLogger(int levels) {
		this.levels = levels;
	}

	@Override
	public void displayLogMessage(String message) {

		System.out.println("ERROR Logger :: " + message);
	}

}

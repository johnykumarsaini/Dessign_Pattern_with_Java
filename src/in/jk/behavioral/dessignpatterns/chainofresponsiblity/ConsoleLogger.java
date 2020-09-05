package in.jk.behavioral.dessignpatterns.chainofresponsiblity;

public class ConsoleLogger extends Logger {

	
	public ConsoleLogger(int levels) {
    this.levels=levels;
    }
	
	@Override
	public void displayLogMessage(String message) {
	
		System.out.println("Console Logger INOF :: "+message);
		
	}

	

}

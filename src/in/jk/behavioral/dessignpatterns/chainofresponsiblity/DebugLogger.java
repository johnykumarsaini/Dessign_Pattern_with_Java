package in.jk.behavioral.dessignpatterns.chainofresponsiblity;

public class DebugLogger extends Logger {
	
	public DebugLogger(int levels) {
	    this.levels=levels;
	    }
		
		@Override
		public void displayLogMessage(String message) {
		
			System.out.println("DEBUG Logger INFO :: "+message);
			
		}

}

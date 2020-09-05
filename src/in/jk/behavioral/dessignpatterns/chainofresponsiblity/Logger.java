package in.jk.behavioral.dessignpatterns.chainofresponsiblity;

public abstract class Logger {
	
	public static int OUTINFO=1;
	public static int ERRORINFO=2;
	public static int DEBUGINFO=3;
	protected int levels =0;
	private Logger nextLogger;
	
	public void  setNextLogger(Logger logger) {
		this.nextLogger = logger;
	}
	
	
	public void logMessage(int levels ,String message) {
		
		if(this.levels<=levels){
			displayLogMessage(message);
		}
		
		
		if(nextLogger!=null) {
			nextLogger.logMessage(levels, message);
		}
	}
	
	
	public abstract void displayLogMessage(String message);


}

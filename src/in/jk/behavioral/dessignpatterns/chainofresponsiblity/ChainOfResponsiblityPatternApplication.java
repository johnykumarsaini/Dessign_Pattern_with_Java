package in.jk.behavioral.dessignpatterns.chainofresponsiblity;

public class ChainOfResponsiblityPatternApplication {
	
	public static void main(String[] args) {
		
		Logger logger = loggerChainng();
		logger.logMessage(Logger.OUTINFO, "INFO Looger Message");
		logger.logMessage(Logger.ERRORINFO, "ERROR Logger Message");
		logger.logMessage(Logger.DEBUGINFO, "DEBUG Logger Message");
		
		
		
	}
	
	
	public static Logger  loggerChainng() {
		
		
		Logger consoleLogger = new ConsoleLogger(Logger.OUTINFO);
		
		Logger errorLogger = new ERRORLogger(Logger.ERRORINFO);
		errorLogger.setNextLogger(consoleLogger);
		
		Logger debugLogger = new DebugLogger(Logger.DEBUGINFO);
		debugLogger.setNextLogger(debugLogger);
		

		
		return consoleLogger;
		
		
	}

}

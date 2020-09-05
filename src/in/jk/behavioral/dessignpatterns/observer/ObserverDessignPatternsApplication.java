package in.jk.behavioral.dessignpatterns.observer;

public class ObserverDessignPatternsApplication {
	
	public static void main(String[] args) {
		
		
		EventSource eventSource = new  EventSource();
		eventSource.addObserver(new ResponseHandler1());
		eventSource.addObserver(new ResponseHandler2());

		eventSource.publishEvent("Event #1 ");
		
		
		System.out.println("Finish ...");
		
	}

}

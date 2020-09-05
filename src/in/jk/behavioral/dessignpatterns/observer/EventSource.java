package in.jk.behavioral.dessignpatterns.observer;

import java.util.Observable;

public class EventSource extends Observable {

	public void publishEvent(String event) {
		
		setChanged();
		//notifyObservers();
		notifyObservers(event);

	}

}

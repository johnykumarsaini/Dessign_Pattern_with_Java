package in.jk.behavioral.dessignpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {

	@Override
	public void update(Observable o, Object obj) {

	System.out.println("ResponseHandler2 :: "+obj);
		
	}

}

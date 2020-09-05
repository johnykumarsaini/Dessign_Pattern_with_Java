package in.jk.behavioral.dessignpatterns.originator;

import java.util.List;
import java.util.ArrayList;

public class CareTaker {

	private List<Memonto> memontos = new ArrayList<>();

	public void addMemonto(Memonto memonto) {
		
		memontos.add(memonto);
	}

	public Memonto getMemonto(int index) {
		
		return memontos.get(index);
	}

}

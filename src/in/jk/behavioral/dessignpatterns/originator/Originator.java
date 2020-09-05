package in.jk.behavioral.dessignpatterns.originator;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memonto saveStateToMemento() {
		return new Memonto(state);
	}

	public void getStateFromMemonto(Memonto memonto) {
		state = memonto.getState();

	}

}

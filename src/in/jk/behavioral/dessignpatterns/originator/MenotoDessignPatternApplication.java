package in.jk.behavioral.dessignpatterns.originator;

public class MenotoDessignPatternApplication {

	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State #1");
		careTaker.addMemonto(originator.saveStateToMemento());
		originator.setState("State #2");
		careTaker.addMemonto(originator.saveStateToMemento());
		originator.setState("State #3");
		careTaker.addMemonto(originator.saveStateToMemento());
		originator.setState("State #4");
		careTaker.addMemonto(originator.saveStateToMemento());

		
		System.out.println("Current State : " + originator.getState());
        originator.getStateFromMemonto(careTaker.getMemonto(0));
        System.out.println("First State :   " + originator.getState());
		originator.getStateFromMemonto(careTaker.getMemonto(1));
        System.out.println("Second State :  " + originator.getState());
        originator.getStateFromMemonto(careTaker.getMemonto(2));
		System.out.println("Third State :   " + originator.getState());
		originator.getStateFromMemonto(careTaker.getMemonto(3));

	}

}

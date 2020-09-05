package in.jk.behavioral.dessignpatterns.state;

public class StateDessignPatternsApplication {
	
	public static void main(String[] args) {
		
		
		Controller controller = new Controller();
		
		controller.setAccountConnection();
		
		controller.open();
		controller.update();
		controller.close();
		
		controller.setManagementConnection();
		
		controller.open();
		controller.update();
		controller.close();
	}

}

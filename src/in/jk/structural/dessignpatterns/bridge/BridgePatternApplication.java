package in.jk.structural.dessignpatterns.bridge;

public class BridgePatternApplication {
	
	public static void main(String[] args) {
		
		QuestionManager manager = new QuestionManager("Java Question Set 1 ...");
		manager.question = new JavaQuestions();
		
		System.out.println("All Java Questions :: ");
		manager.displayAllQuestions();
		manager.addQuestion("What is compostion ");
		System.out.println("Updated List  Java Questions :: ");
		manager.displayAllQuestions();
		
		
	}

}

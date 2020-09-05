package in.jk.structural.dessignpatterns.bridge;

public class QuestionFormatter extends QuestionManager {

	public QuestionFormatter(String questionSubject) {
		super(questionSubject);
	}

	public void displayAllQuestions() {

		System.out.println("/------------------------------------------------------------/");
		super.displayAllQuestions();
		System.out.println("/------------------------------------------------------------/");

	}
}

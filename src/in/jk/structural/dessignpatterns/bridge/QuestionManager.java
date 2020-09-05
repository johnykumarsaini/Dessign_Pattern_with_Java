package in.jk.structural.dessignpatterns.bridge;

public class QuestionManager {
	
	protected Question question;
	public String questionSubject;
	
	public QuestionManager(String questionSubject) {
		
		this.questionSubject =questionSubject;
	}
	
	
	
	public void addQuestion(String question) {
		this.question.addQuestion(question);
	}

	
	public void remove(String question) {
		this.question.remove(question);

	}


	public void displayAllQuestions() {

		question.displayAllQuestions();
	}

}

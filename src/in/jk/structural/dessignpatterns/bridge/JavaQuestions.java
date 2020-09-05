package in.jk.structural.dessignpatterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

	List<String> JavaQuestions = new ArrayList<String>();

	public JavaQuestions() {

		JavaQuestions.add("What is Java");
		JavaQuestions.add("What is Abstraction");
		JavaQuestions.add("What is Method Overriding ");
		JavaQuestions.add("What is Servelt");
		JavaQuestions.add("What is Spring Boot");

	}

	@Override
	public void addQuestion(String question) {
		JavaQuestions.add(question);
	}

	@Override
	public void remove(String question) {
		JavaQuestions.remove(question);

	}

	@Override
	public void displayAllQuestions() {

		JavaQuestions.forEach(System.out::println);
	}

}

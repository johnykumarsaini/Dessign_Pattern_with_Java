package in.jk.behavioral.dessignpatterns.startegy;

public class Context {

	Calculator calculator;

	public Context(Calculator calculator) {
		this.calculator = calculator;
	}

	public void calcuate(double num1, double num2) {
		double result = calculator.calculate(num1, num2);
		System.out.println("Result :: " + result);

	}

}

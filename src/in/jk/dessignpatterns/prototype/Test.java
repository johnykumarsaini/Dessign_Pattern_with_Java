package in.jk.dessignpatterns.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Computer computer = new Computer();
		System.out.println(computer);
		Computer computer2 = (Computer) computer.clone();
		System.out.println(computer2);
		System.out.println(computer==computer2);
		
	}
}

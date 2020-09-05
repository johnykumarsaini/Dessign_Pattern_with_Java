package in.jk.behavioral.dessignpatterns.state;

public class Accounting implements Connection {

	@Override
	public void open() {
		
		System.out.println("Account Connection is open ");
		
	}

	@Override
	public void close() {
		System.out.println("Account Connection is close ");
		
	}

	@Override
	public void update() {
		System.out.println("Account Connection is update ");
		
	}

}

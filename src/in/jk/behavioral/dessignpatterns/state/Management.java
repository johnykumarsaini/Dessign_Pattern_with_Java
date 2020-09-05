package in.jk.behavioral.dessignpatterns.state;

public class Management implements Connection{

	@Override
	public void open() {

		System.out.println("Management Connection open :: ");
	}

	@Override
	public void close() {
		System.out.println("Management Connection close :: ");
		
	}

	@Override
	public void update() {
		System.out.println("Management Connection update :: ");
		
	}

}

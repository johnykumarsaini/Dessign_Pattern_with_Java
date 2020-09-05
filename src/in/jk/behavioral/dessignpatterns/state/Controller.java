package in.jk.behavioral.dessignpatterns.state;

public class Controller {

	public static Accounting accounting;
	public static Management management;
	public Connection connection;

	public Controller() {

		accounting = new Accounting();
		management = new Management();
	}

	public void setAccountConnection() {

		connection = accounting;
	}

	public void setManagementConnection() {

		connection = management;
	}

	public void open() {
		connection.open();
	}

	public void close() {
		connection.close();

	}

	public void update() {
		connection.update();

	}

}

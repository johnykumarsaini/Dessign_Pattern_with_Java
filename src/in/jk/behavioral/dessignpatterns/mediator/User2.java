package in.jk.behavioral.dessignpatterns.mediator;



public class User2 implements UserManager {

	Messanger messager;
	private String name;

	public User2(Messanger messanger) {
		this.messager = messanger;
	}

	@Override
	public void sendMessage(String message) {
		
		messager.sendMessage(message, this);
	}

	@Override
	public void setName(String name) {
		
		this.name=name;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}

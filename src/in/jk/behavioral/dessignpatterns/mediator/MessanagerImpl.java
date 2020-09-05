package in.jk.behavioral.dessignpatterns.mediator;

public class MessanagerImpl implements Messanger {

	@Override
	public void sendMessage(String message, UserManager manager) {
		
		System.out.println(manager.getName() +" Send  a message  :: "+message);
		
	}

	

}

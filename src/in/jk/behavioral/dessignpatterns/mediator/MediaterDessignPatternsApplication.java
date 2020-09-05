package in.jk.behavioral.dessignpatterns.mediator;

public class MediaterDessignPatternsApplication {
	
	public static void main(String[] args) {
		
		Messanger messanger = new MessanagerImpl();
		
		User1 user1 = new User1(messanger);
		
		user1.setName("JK");
		user1.sendMessage("Hey How's going on ...");
		
		User2 user2 = new User2(messanger);
		
		user2.setName("Johny");
		user2.sendMessage("Abe kuch nhi kar rha hu bas Dessign pattern padh rha hu ...");
		
		user1.sendMessage("Oh oh .. theek hai mai to so ne ja rha hu  ...");
	}

}

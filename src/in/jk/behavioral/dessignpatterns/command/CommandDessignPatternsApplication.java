package in.jk.behavioral.dessignpatterns.command;

public class CommandDessignPatternsApplication {
	
	public static void main(String[] args) {
		
	
	
	Document document = new Document();
	CommandActionListener openActionListener = new ActionOpen(document);
	CommandActionListener saveActionListener = new ActionSave(document);
	
	
	Menu menu = new Menu();
	menu.setActionListener(openActionListener);
	menu.clickOpen();
	
	menu.setActionListener(saveActionListener);
	menu.clickSave();
	
	

	}
}

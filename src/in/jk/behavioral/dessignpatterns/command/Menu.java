package in.jk.behavioral.dessignpatterns.command;

public class Menu {
	
	;
	
	CommandActionListener actionListener;

	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickOpen() {

		actionListener.execute();
	}

	public void clickSave() {

		actionListener.execute();
	}


	public CommandActionListener getActionListener() {
		return actionListener;
	}


	public void setActionListener(CommandActionListener actionListener) {
		this.actionListener = actionListener;
	}


	
	
	

}

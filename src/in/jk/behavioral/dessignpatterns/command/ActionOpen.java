package in.jk.behavioral.dessignpatterns.command;

public class ActionOpen implements CommandActionListener {

	Document document=null;
	
	public ActionOpen(Document document) {
     this.document=document;
	}
	
	@Override
	public void execute() {
		
		document.open();
		
	}

}

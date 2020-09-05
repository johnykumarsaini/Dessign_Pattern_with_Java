package in.jk.behavioral.dessignpatterns.command;

import in.jk.behavioral.dessignpatterns.command.CommandActionListener;
import in.jk.behavioral.dessignpatterns.command.Document;




public class ActionSave implements CommandActionListener {

	Document document=null;
	
	public ActionSave(Document document) {
     this.document=document;
	}
	
	@Override
	public void execute() {
		
		document.save();
		
	}

}

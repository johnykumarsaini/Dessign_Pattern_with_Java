package in.jk.structural.dessignpatterns.decorator;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		
		return " Aallu ke Prathe ";
	}

	@Override
	public float price() {
		return 50;
	}

}

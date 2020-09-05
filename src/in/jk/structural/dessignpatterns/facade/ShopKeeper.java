package in.jk.structural.dessignpatterns.facade;

public class ShopKeeper {

	IPhone iPhone = null;
	SamsungPhone samsungPhone = null;

	public ShopKeeper() {

		iPhone = new IPhone();
		samsungPhone = new SamsungPhone();

	}
	
	public void getIPhoneSale() {
		
		System.out.println(iPhone.modelName());
		System.out.println(iPhone.price());
	}
	
	public void getSamsungPhone() {
		
		System.out.println(samsungPhone.modelName());
		System.out.println(samsungPhone.price());
	}
    
}

package in.jk.structural.dessignpatterns.facade;

/* Facade Pattern Says :
 * Just provide a unified and simplified interface to a set of interfaces in a subsystem, 
 * therefore it hides the complexities of the subsystem from the client
 */

public class FacadeDessignPatternsApplication {
	
	public static void main(String[] args) {
		
		ShopKeeper shopKeeper= new ShopKeeper();
		shopKeeper.getIPhoneSale();
		System.out.println();
		shopKeeper.getSamsungPhone();
	}

}

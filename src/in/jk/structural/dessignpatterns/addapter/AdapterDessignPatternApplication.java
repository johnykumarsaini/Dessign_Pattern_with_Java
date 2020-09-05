package in.jk.structural.dessignpatterns.addapter;

public class AdapterDessignPatternApplication {
	
	public static void main(String[] args) {
		
		BankCard bankCard =  new BankCustomer();
		bankCard.bankDetails();
		String bankCardInfo =bankCard.getBankCard();
		System.out.println(bankCardInfo);
		
	}

}

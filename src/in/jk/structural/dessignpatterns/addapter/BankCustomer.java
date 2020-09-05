package in.jk.structural.dessignpatterns.addapter;

public class BankCustomer extends Bank implements BankCard{

	Bank bank = new  Bank();

	
	@Override
	public void bankDetails() {
		
		bank.setAccountNumber(01145);
		bank.setUserName("J K");
        bank.setBankName("SBI");
		
	}

	@Override
	public String getBankCard() {
		
		return "Card No : "+1102589+ " \nUser Name :"+ bank.getUserName()+" \nBank Name :"+bank.getBankName() ;
	}

}

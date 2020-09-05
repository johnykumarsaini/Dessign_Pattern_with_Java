package in.jk.structural.dessignpatterns.addapter;

public class Bank {
	
	private int accountNumber;
	private String bankName;
	private String userName;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", bankName=" + bankName + ", userName=" + userName + "]";
	}
	
	

}

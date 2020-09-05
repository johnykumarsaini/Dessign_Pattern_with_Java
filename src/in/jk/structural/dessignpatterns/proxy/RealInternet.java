package in.jk.structural.dessignpatterns.proxy;

public class RealInternet implements Internet {
	
	String employeeId ="0111";

	@Override
	public String getInternetAccess() {
		
		
		return "Real Internet Access Autorize for employee :employeeId "+employeeId;
	}
	
	

}

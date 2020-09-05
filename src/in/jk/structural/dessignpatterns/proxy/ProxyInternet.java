package in.jk.structural.dessignpatterns.proxy;

public class ProxyInternet implements Internet {

	String employeeId = "0112";
	Internet internet = null;
	boolean proxyInternet = Boolean.TRUE;

	@Override
	public String getInternetAccess() {

		if (proxyInternet) {
			internet = new RealInternet();
            String internetAccess = internet.getInternetAccess();
            return internetAccess.substring(0,internetAccess.length()-4) + employeeId+" :: Internet Type=Proxy";

		}
		return  "Internet not Authorize for this person .";
	}

}

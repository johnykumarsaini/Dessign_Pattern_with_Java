package in.jk.structural.dessignpatterns.proxy;

public class ProxyDessignPatternsApplication {

	public static void main(String[] args) {

		Internet realInternet = new RealInternet();
		System.out.println(realInternet.getInternetAccess());
		Internet proxyInternet = new ProxyInternet();
		System.out.println(proxyInternet.getInternetAccess());

	}

}

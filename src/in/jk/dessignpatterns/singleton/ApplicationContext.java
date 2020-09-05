package in.jk.dessignpatterns.singleton;

public class ApplicationContext {

	private static ApplicationContext applicationContext = new ApplicationContext();

	private ApplicationContext() {
	}

	public static ApplicationContext getApplicationContext() {

		return applicationContext;

	}
}

package in.jk.dessignpatterns.singleton;

public class SingletonFactoryApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext1 = ApplicationContext.getApplicationContext();
		ApplicationContext applicationContext2 = ApplicationContext.getApplicationContext();
		System.out.println("Singlton Object by Early Initialization :: ");
		System.out.println("ApplicationContext1 :: " + applicationContext1);
		System.out.println("ApplicationContext2 :: " + applicationContext2);
		System.out.println("ApplicationContext  :: " + (applicationContext1 == applicationContext2));

		System.out.println();

		SessionFactory sessionFactory1 = SessionFactory.getSessionFactory();
		SessionFactory sessionFactory2 = SessionFactory.getSessionFactory();
        System.out.println("Singlton Object by Lazy Initialization :: ");
		System.out.println("SessionFactory1 :: " + sessionFactory1);
		System.out.println("SessionFactory2 :: " + sessionFactory2);
		System.out.println("SessionFactory  :: " + (sessionFactory1 == sessionFactory2));

	
	}

}

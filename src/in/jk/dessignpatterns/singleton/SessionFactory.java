package in.jk.dessignpatterns.singleton;

public class SessionFactory {
	
	private static SessionFactory sessionFactory=null;
	
	private SessionFactory() {}
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory!=null) {
			return sessionFactory;
		}
		
		synchronized (SessionFactory.class) {
			sessionFactory = new SessionFactory();
			return sessionFactory;
			
		}
	}

}

package in.jk.behavioral.dessignpatterns.iterator;

public class IteratorDessignPatternsApplication {
	
	public static void main(String[] args) {
	ArrayList arrayList = new ArrayList();
	Iterator iterator=	arrayList.iterator();

	while (iterator.hasNext()) {
		Object obj= iterator.next();
		System.out.println("Java Technology :: "+obj);
		
	}
		
	}

}

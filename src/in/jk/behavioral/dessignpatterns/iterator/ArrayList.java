package in.jk.behavioral.dessignpatterns.iterator;

import java.util.Arrays;
import java.util.List;

public class ArrayList implements Collection {
	
	List<String> list = Arrays.asList("Java","Servlet","JSP","Spring","Hibernate");

	@Override
	public Iterator iterator() {
		
		
		return new ArrayListItrator();
	}
	
	
	private class ArrayListItrator implements Iterator{

		int index=0;
		@Override
		public boolean hasNext() {
			
			if(index<list.size()) {
				
				return true;
			}
			
			return false;
		}

		@Override
		public Object next() {
			
			if(this.hasNext()) {
			return list.get(index++);}
			
			return null;
			
		}
		
	}

}

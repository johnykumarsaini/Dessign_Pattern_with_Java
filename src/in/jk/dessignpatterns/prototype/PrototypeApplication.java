package in.jk.dessignpatterns.prototype;

public class PrototypeApplication {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setName("J K");
		employee.setCompany("Google");
		
		System.out.println(employee);
		
		Employee employee2 = (Employee) employee.clone();
		System.out.println(employee2);
		
		Employee employee3 =(Employee) employee.getClone();
		System.out.println(employee3);
		System.out.println();
		
		System.out.println(employee==employee2);
		System.out.println(employee==employee3);

		
	}

}

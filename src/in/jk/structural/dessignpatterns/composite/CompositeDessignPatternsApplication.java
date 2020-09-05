package in.jk.structural.dessignpatterns.composite;

public class CompositeDessignPatternsApplication {
	
	public static void main(String[] args) {
		
		
		Developer employee = new Developer();
		employee.setEmpId(1);
		employee.setName("J K");
		employee.setCompany("Google");
		
		Designer employee1 = new Designer();
		employee1.setEmpId(2);
		employee1.setName("111");
		employee1.setCompany("000");
		
		Manager manager = new Manager();
		manager.setEmpId(3);
		manager.setName("fgfgscsdf");
		manager.setCompany("hbxhsdb");
		
		
		manager.employees.add(employee);
		manager.employees.add(employee1);
		manager.employees.add(manager);
		
		manager.print();
		
	}

}

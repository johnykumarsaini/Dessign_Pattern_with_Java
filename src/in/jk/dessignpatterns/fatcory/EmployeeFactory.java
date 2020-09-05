package in.jk.dessignpatterns.fatcory;

public class EmployeeFactory {
	
	public static Employee getEmployee(String employeeType) {
		
		Employee employee =null;
		
		if ("Permanent".equals(employeeType)) {
			employee=new PermanetEmployee();
		}
		
		if ("Contractual".equals(employeeType)) {
			employee=new ContarctualEmployee();
		}
		
		return employee;
		
	}

}

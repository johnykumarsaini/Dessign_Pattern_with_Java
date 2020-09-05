package in.jk.dessignpatterns.fatcory;

public class FactoryDessignPatternApplication {

	public static void main(String[] args) {

		Employee permanentEmployee = EmployeeFactory.getEmployee("Permanent");
		System.out.println("Employee Type :: " + permanentEmployee.getEmployee());
		Employee contractualEmployee = EmployeeFactory.getEmployee("Contractual");
		System.out.println("Employee Type :: " + contractualEmployee.getEmployee());

	}

}

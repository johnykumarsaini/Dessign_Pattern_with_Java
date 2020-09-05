package in.jk.structural.dessignpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private int empId;
	private String name;
	private String company;

	List<Employee> employees = new ArrayList<Employee>();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void print() {
		employees.forEach(System.out::println);
	}

	@Override
	public void addEmplyee(Employee employee) {

		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);

	}

	@Override
	public Employee getChild(int i) {

		return employees.get(i);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	public String getEmpName() {
		// TODO Auto-generated method stub
		return name;
	}

}

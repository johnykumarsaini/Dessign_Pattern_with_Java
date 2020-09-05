package in.jk.structural.dessignpatterns.composite;

public class Developer implements Employee {

	private int empId;
	private String name;
	private String company;

	
	
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

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEmplyee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return company;
	}

	@Override
	public String toString() {
		return "Developer [empId=" + empId + ", name=" + name + ", company=" + company + "]";
	}
	
	

}

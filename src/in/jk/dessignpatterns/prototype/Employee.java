package in.jk.dessignpatterns.prototype;

public class Employee implements Prototype ,Cloneable{
	
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
   public Object getClone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public Prototype clone() {
		
		return this;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", company=" + company + "]";
	}



}

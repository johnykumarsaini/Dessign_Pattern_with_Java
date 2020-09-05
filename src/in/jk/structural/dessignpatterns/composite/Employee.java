package in.jk.structural.dessignpatterns.composite;

public interface Employee {
	
	public int getId();
	public String getEmpName();
	public String getCompany();
	public void print();
	public void addEmplyee(Employee employee);
	public void remove(Employee employee);  
    public Employee getChild(int i);

	
	
	

}

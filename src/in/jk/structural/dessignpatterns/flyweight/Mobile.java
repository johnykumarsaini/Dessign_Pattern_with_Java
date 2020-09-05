package in.jk.structural.dessignpatterns.flyweight;

public class Mobile {

	private String modelName;
	private String name;
	private double price;
	private String company;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Mobile [modelName=" + modelName + ", name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
	
	
	
}

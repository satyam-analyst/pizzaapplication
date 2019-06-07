package pos;

public class Pizza {
	private String name;
	private double price;
	private double cookingTime;
	public Pizza(String name, double price, double cookingTime) {
		super();
		this.name = name;
		this.price = price;
		this.cookingTime = cookingTime;
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
	public double getCookingTime() {
		return cookingTime;
	}
	public void setCookingTime(double cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	

}

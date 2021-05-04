package simpleGameSalesSimulation;

public class Games {

	private int id = (int) Math.floor(Math.random() * (200 - 101) + 100);
	private String name;
	private double price;

	public Games( String name, double price) {
		super();
		
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
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

}

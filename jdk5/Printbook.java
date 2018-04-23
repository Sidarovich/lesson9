package epm.com.jdk5;

public class Printbook extends Text {
	private double price;
	private int yearPublished;

	public Printbook(String title, int yearPublished, double price) {
		super(title);
		this.yearPublished = yearPublished;
		this.price = price;

	}

	public double getPrice() {
		return price;
	}
	public int getyearPublished() {
		return yearPublished;
	}
}

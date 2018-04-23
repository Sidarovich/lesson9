package epm.com.jdk5;

public class PrintedBook  extends Text {
	private String Publisher;
	private int yearPublished;

	public PrintedBook(String title, int yearPublished, String Publisher) {
		super(title);
		this.yearPublished = yearPublished;
		this.Publisher = Publisher;

	}

	public String getPublisher() {
		return Publisher;
	}
	public int getyearPublished() {
		return yearPublished;
	}

}

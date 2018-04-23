package epm.com.jdk5;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printbook mybook1 = new Printbook("Java", 2018,5);
		System.out.println("Added to library: " + mybook1.getTitle() + " year: " + mybook1.getyearPublished()
				+ " price: " + mybook1.getPrice());
		PrintedBook mybook2 = new PrintedBook ("Java1", 2018, "ggg");
		System.out.println("Added to library: " + mybook2.getTitle() + " year: " + mybook2.getyearPublished()
		+ " publisher: " + mybook2.getPublisher());		
	}
}
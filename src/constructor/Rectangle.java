package constructor;

public class Rectangle {

	double width, height;
	String color;

	public Rectangle() {
		System.out.println("No argument");

	}

	public Rectangle(double width, double height) {
		this();
		this.width = width;
		this.height = height;
		System.out.println("Two arguments");

	}

	public Rectangle(double width, double height, String color) {
		this(width, height);
		this.color = color;
		System.out.println("Three arguments");

	}

	public void getDisplay() {
		System.out.println("width: " + width + " height: " + height + " color: " + color);
	}

}

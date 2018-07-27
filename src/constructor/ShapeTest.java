package constructor;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		r.height = 12.3;
		r.width = 14.5;
		r.getDisplay();
		System.out.println("_______________________________________________");

		Rectangle r2 = new Rectangle(18.9, 8.6);
		r2.getDisplay();
		
		System.out.println("_______________________________________________");
		
		Rectangle r3 = new Rectangle(13.5, 24.2, "red");
		r3.getDisplay();
	}

}

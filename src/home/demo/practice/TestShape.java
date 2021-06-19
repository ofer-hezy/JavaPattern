package home.demo.practice;

public class TestShape {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(12, 10);
		System.out.println(rectangle.getName());
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimiter());
	}
}

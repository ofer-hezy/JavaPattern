package home.demo.practice;

public class Rectangle implements Shape {
	public static String _name = "Rectangle";
	private float height;
	private float width;
	
	public Rectangle(float height , float width) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Rectangle._name;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	@Override
	public float getPerimiter() {
		// TODO Auto-generated method stub
		return 2*(this.width+this.height);
	}

}

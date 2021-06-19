package home.demo.pattern.prototype;

public class Show implements Media {

	@Override
	public Show clone() throws CloneNotSupportedException {
		
		return (Show)super.clone();
	}
	public void media() {
		System.out.println(Media.Show);
	}
}

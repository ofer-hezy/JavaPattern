package home.demo.pattern.prototype;

public class Movie implements Media {

	@Override
	public Movie clone() throws CloneNotSupportedException {
		
		return (Movie)super.clone();
	}
	public void media() {
		System.out.println(Media.Movie);
	}

}

package home.demo.pattern.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		try {
			Movie movie = (Movie)MediaPrototype.getMedia(Media.Movie);
			movie.media();
			Show show = (Show)MediaPrototype.getMedia(Media.Show);
			show.media();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

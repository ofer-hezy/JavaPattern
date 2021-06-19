package home.demo.pattern.prototype;

import java.util.Map;
import java.util.TreeMap;

public class MediaPrototype {
	
  public final class MediaType{
	
  }

  private static Map<String,Media> prototypes = new TreeMap<String, Media>();
  
  static {
	  prototypes.put(Media.Movie,new Movie());
	  prototypes.put(Media.Show , new Show());
  }
  public static Media getMedia(final String media) throws CloneNotSupportedException  {
	  // need to check MediaTypes
	  return prototypes.get(media).clone(); 
  }
 
}

package home.demo.pattern.prototype;

public interface Media extends Cloneable {
  public final static String Movie = "movie";
  public final static String Show = "show";
  public Media clone() throws CloneNotSupportedException;
  public void media();
 
}

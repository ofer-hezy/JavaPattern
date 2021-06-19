package practice.demo.lambda;

@FunctionalInterface
public interface VoidFunction<T> {
  void info(T t);
   static void  help() {
	  System.out.println("This interface is FunctionalInterface with \"void info (T t)\" method and static  void help() function ");
  }
}

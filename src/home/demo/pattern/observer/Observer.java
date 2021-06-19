package home.demo.pattern.observer;

public interface Observer {
  
   public void register();
   public void stateChange(Object obj);
   public Object getCurrentState();
   
}

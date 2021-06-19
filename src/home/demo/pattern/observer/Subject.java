package home.demo.pattern.observer;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Subject {
	private static Subject self = null;
	private Date date;
	private Set<Observer> observers = new HashSet<Observer>();

	private Subject() {
		this.date = new Date();
	}

	public static Subject getInstance() {
		if (self == null) {
			synchronized (Thread.currentThread()) {
				if (self == null)
					self = new Subject();
			}
		}
		return self;

	}

	public void register(Observer observer) {
		if (observer != null) {
			this.observers.add(observer);
		}
	}
	public void unregister(Observer observer) {
		if (observer != null) {
			this.observers.remove(observer);
		}
	}
	

	public void stateChange() {
		this.date = new Date();
		notifyObservers();
	}
    public String getState() {
    	return this.date.toString();
    }
	private void notifyObservers() {
		for (Observer observer : observers) {
			observer.stateChange(this.date.toString());
		}
	}

}

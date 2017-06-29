package org.test.javadesignpatterns.observer2;

public interface ISubject2 
{
	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObservers(int i);
}

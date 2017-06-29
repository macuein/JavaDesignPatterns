package org.test.javadesignpatterns.observer3;

public interface ISubject 
{
	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObservers(int i);
}

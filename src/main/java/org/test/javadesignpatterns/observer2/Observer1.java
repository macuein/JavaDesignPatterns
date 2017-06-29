package org.test.javadesignpatterns.observer2;

public class Observer1 implements IObserver 
{

	public void update(int i) 
	{
		System.out.println("Observer1: myValue in Subject is now: "+i);
	}

}

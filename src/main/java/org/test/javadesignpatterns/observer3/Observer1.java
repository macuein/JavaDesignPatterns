package org.test.javadesignpatterns.observer3;

public class Observer1 implements IObserver 
{

	public void update(String s, int i) 
	{
		System.out.println("Observer1: myValue in "+ s+ " is now: "+i);

	}

}

package org.test.javadesignpatterns.observer3;

public class Observer2 implements IObserver 
{

	public void update(String s, int i) 
	{
		System.out.println("Observer2: observes ->myValue is changed in"+s+" to :"+i);

	}

}

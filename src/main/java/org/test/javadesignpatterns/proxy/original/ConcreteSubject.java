package org.test.javadesignpatterns.proxy.original;

public class ConcreteSubject extends Subject
{
	
	@Override
	public void doSomeWork()
	{
		System.out.println(" I am from concrete subject");
	}
	
}

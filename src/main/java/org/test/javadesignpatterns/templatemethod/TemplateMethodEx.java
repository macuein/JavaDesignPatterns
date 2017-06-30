package org.test.javadesignpatterns.templatemethod;

public class TemplateMethodEx 
{

	public void ExecutePattern()
	{
		
		System.out.println("***Template Method Pattern Demo***\n");
		BasicEngineering bs = new ComputerScience();
		System.out.println("Computer Sc Papers:");
		bs.Papers();
		System.out.println();
		bs = new Electronics();
		System.out.println("Electronics Papers:");
		bs.Papers();
		
	}
	
	
}

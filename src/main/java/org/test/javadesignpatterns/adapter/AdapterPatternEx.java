package org.test.javadesignpatterns.adapter;

public class AdapterPatternEx 
{

	public void ExecutePattern()
	{
		System.out.println("***Adapter Pattern Demo***");
		Rectangle r = new Rectangle(20, 10);
		Calculator calc = new Calculator();
		System.out.println("Area of Rectangle is :" + calc.getArea(r));
		Triangle t = new Triangle(20,10);
		CalculatorAdapter cal=new CalculatorAdapter();
		System.out.println("\nAdapter Pattern Example\n");
		System.out.println("Area of Triangle is :" + cal.getArea(t));
	}
	
	
}

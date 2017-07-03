package org.test.javadesignpatterns.adapter2;

public class Adapter2PatternEx 
{
	
	public void ExecutePattern()
	{
		System.out.println("***Class and Object Adapter Demo***");
		ClassAdapter ca1=new ClassAdapter();
		System.out.println("Class Adapter is returning :"+ca1.getInteger());
		ClassAdapter ca2=new ClassAdapter();
		ObjectAdapter oa=new ObjectAdapter(new IntegerValue());
		System.out.println("Object Adapter is returning :"+oa.getInteger());
		
	}
	
	
}

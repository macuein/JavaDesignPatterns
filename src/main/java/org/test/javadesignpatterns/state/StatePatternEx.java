package org.test.javadesignpatterns.state;

public class StatePatternEx 
{

	public void ExecutePattern()
	{
		
		System.out.println("***State Pattern Demo***\n");
		//Initially TV is Off
		Off initialState = new Off();
		TV tv = new TV(initialState);
		//First time press
		tv.pressButton();
		//Second time press
		tv.pressButton();
		
	}
	
}

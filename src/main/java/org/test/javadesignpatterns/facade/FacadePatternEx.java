package org.test.javadesignpatterns.facade;

import org.test.javadesignpatterns.facade.robotfacade.RobotFacade;

public class FacadePatternEx 
{

	public void ExecutePattern()
	{
		System.out.println("***Facade Pattern Demo***");
		RobotFacade rf1 = new RobotFacade();
		rf1.ConstructRobot("Green", "Iron");
		RobotFacade rf2 = new RobotFacade();
		rf2.ConstructRobot("Blue", "Steel");
	}
	
}

package org.test.javadesignpatterns.command;

public class CommandPatternEx 
{

	public void ExecutePattern()
	{
		
		System.out.println("***Command Pattern Demo***\n");
		Receiver intendedreceiver=new Receiver();
		/*Client holds Invoker and Command Objects*/
		Invoke inv = new Invoke();
		MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
		MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
		inv.ExecuteCommand(unCmd);
		inv.ExecuteCommand(reCmd);
		
	}
	
}

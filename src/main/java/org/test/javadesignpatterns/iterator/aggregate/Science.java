package org.test.javadesignpatterns.iterator.aggregate;

import java.util.LinkedList;

import org.test.javadesignpatterns.iterator.iterator.IIterator;

public class Science implements ISubject 
{

	private LinkedList<String> subjects;
	
	public Science()
	{
		subjects = new LinkedList<String>();
		subjects.addLast("Maths");
		subjects.addLast("Comp. Sc.");
		subjects.addLast("Physics");
	}
	
	public IIterator CreateIterator()
	{
		return new ScienceIterator(subjects);
	}	

}

package org.test.javadesignpatterns.iterator.aggregate;

import org.test.javadesignpatterns.iterator.iterator.IIterator;

public class Arts implements ISubject 
{

	private String[] subjects;
	
	public Arts()
	{
		subjects = new String[2];
		subjects[0] = "Bengali";
		subjects[1] = "English" ;
	}
	
	public IIterator CreateIterator()
	{
		return new ArtsIterator(subjects);
	}
	
}

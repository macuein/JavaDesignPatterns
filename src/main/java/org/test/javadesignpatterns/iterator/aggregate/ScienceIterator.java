package org.test.javadesignpatterns.iterator.aggregate;

import java.util.LinkedList;

import org.test.javadesignpatterns.iterator.iterator.IIterator;

public class ScienceIterator implements IIterator 
{

	private LinkedList<String> subjects;
	private int position;
		
	public ScienceIterator(LinkedList<String> subjects)
	{
		this.subjects = subjects;
		position = 0;
	}
	
	public void First()
	{
		position = 0;
	}

	public String Next()
	{
		return subjects.get(position++);
	}
	
	public Boolean IsDone()
	{
		return position >= subjects.size();
	}
	
	public String CurrentItem()
	{
		return subjects.get(position);
	}

}

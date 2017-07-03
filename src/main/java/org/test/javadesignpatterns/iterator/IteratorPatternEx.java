package org.test.javadesignpatterns.iterator;

import org.test.javadesignpatterns.iterator.aggregate.Arts;
import org.test.javadesignpatterns.iterator.aggregate.ISubject;
import org.test.javadesignpatterns.iterator.aggregate.Science;
import org.test.javadesignpatterns.iterator.iterator.IIterator;

public class IteratorPatternEx 
{

	public void ExecutePattern()
	{
		System.out.println("***Iterator Pattern Demo***\n");
		ISubject Sc_subject = new Science();
		ISubject Ar_subjects = new Arts();
		IIterator Sc_iterator = Sc_subject.CreateIterator();
		IIterator Ar_iterator = Ar_subjects.CreateIterator();
		System.out.println("\nScience subjects :");
		Print(Sc_iterator);
		System.out.println("\nArts subjects :");
		Print(Ar_iterator);
	}

	public static void Print(IIterator iterator)
	{
		while (!iterator.IsDone())
		{
			System.out.println(iterator.Next());
		}
	}
	
}

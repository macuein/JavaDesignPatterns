package org.test.javadesignpatterns.memento;

public class Caretaker 
{

	private Memento _memento;
	
	public void SaveMemento(Memento m)
	{
		_memento = m;
	}
	
	public Memento RetrieveMemento()
	{
		return _memento;
	}
	
}

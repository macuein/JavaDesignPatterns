package org.test.javadesignpatterns.factorymethod;

public class FactoryMethodPatternEx 
{

	public void ExecutePattern() throws Exception
	{
		
		System.out.println("***Factory Pattern Demo***\n");
		IAnimalFactory animalFactory = new ConcreteFactory();
		IAnimal DuckType=animalFactory.GetAnimalType("Duck");
		DuckType.Speak();
		IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
		TigerType.Speak();
		//There is no Lion type. So, an exception will be thrown
		IAnimal LionType = animalFactory.GetAnimalType("Lion");
		LionType.Speak();
	}
	
}

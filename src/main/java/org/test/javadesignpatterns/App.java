package org.test.javadesignpatterns;

import org.test.javadesignpatterns.adapter.AdapterPatternEx;
import org.test.javadesignpatterns.adapter2.Adapter2PatternEx;
import org.test.javadesignpatterns.builder.BuilderPatternEx;
import org.test.javadesignpatterns.command.CommandPatternEx;
import org.test.javadesignpatterns.decorator.DecoratorPatternEx;
import org.test.javadesignpatterns.facade.FacadePatternEx;
import org.test.javadesignpatterns.factorymethod.FactoryMethodPatternEx;
import org.test.javadesignpatterns.iterator.IteratorPatternEx;
import org.test.javadesignpatterns.memento.MementoPatternEx;
import org.test.javadesignpatterns.observer.ObserverPatternEx;
import org.test.javadesignpatterns.observer2.Observer2PatternEx;
import org.test.javadesignpatterns.observer3.Observer3PatternEx;
import org.test.javadesignpatterns.proxy.ProxyPatternEx;
import org.test.javadesignpatterns.singleton.SingletonPatternEx;
import org.test.javadesignpatterns.state.StatePatternEx;
import org.test.javadesignpatterns.strategypattern.StrategyPatternEx;
import org.test.javadesignpatterns.templatemethod.TemplateMethodEx;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws Exception
    {
		
		//Builder Pattern
		BuilderPatternEx builderpat = new BuilderPatternEx();
		builderpat.ExecutePattern();
		
		//State Pattern Example
		//StatePatternEx statepat = new StatePatternEx();
		//statepat.ExecutePattern();
		
		//Memento Pattern Example
		//MementoPatternEx memento = new MementoPatternEx();
		//memento.ExecutePattern();
		
		//Factory Method Pattern
		//FactoryMethodPatternEx factory = new FactoryMethodPatternEx();
		//factory.ExecutePattern();
		
		//Facade Pattern
		//FacadePatternEx facade = new FacadePatternEx();
		//facade.ExecutePattern();
		
		//Iterator Pattern
		//IteratorPatternEx iterator = new IteratorPatternEx();
		//iterator.ExecutePattern();
		
		//Command Pattern
		//CommandPatternEx command = new CommandPatternEx();
		//command.ExecutePattern();
		
		//Adapter 2 Pattern
		//Adapter2PatternEx adapter2 = new Adapter2PatternEx();
		//adapter2.ExecutePattern();
		
		//Adapter Pattern
		//AdapterPatternEx adapter = new AdapterPatternEx();
		//adapter.ExecutePattern();
		
		//Strategy Pattern
		//StrategyPatternEx strategy = new StrategyPatternEx();
		//strategy.ExecutePattern();

		//Template Method Pattern
		//TemplateMethodEx tmplmethod = new TemplateMethodEx();
		//tmplmethod.ExecutePattern();
		
		//Decorator Pattern
		//DecoratorPatternEx decorator = new DecoratorPatternEx();
		//decorator.ExecutePattern();
		
		//Proxy Pattern
		//ProxyPatternEx proxy = new ProxyPatternEx();
		//proxy.ExecutePattern();
		
		//Singleton Pattern
		//SingletonPatternEx singleton = new SingletonPatternEx();
		//singleton.ExecutePattern();
		
		//Observer3 Pattern	
		//Observer3PatternEx obsEx3 = new Observer3PatternEx();;
		//obsEx3.ExecutePattern();
		
		//Observer2 Pattern	
		//Observer2PatternEx obsEx2 = new Observer2PatternEx();;
		//obsEx2.ExecutePattern();
		
		//Observer Pattern	
		//ObserverPatternEx obsEx = new ObserverPatternEx();
		//obsEx.ExecutePattern();
		
    }

	
}
		
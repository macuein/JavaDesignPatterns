package org.test.javadesignpatterns;

import org.test.javadesignpatterns.decorator.DecoratorPatternEx;
import org.test.javadesignpatterns.observer.ObserverPatternEx;
import org.test.javadesignpatterns.observer2.Observer2PatternEx;
import org.test.javadesignpatterns.observer3.Observer3PatternEx;
import org.test.javadesignpatterns.proxy.ProxyPatternEx;
import org.test.javadesignpatterns.singleton.SingletonPatternEx;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {

		//Decorator Pattern
		DecoratorPatternEx decorator = new DecoratorPatternEx();
		decorator.ExecutePattern();
		
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
		
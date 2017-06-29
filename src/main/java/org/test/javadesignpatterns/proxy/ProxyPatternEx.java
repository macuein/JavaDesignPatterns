package org.test.javadesignpatterns.proxy;

import org.test.javadesignpatterns.proxy.proxy.Proxy;

public class ProxyPatternEx 
{
	
	public void ExecutePattern()
	{
		System.out.println("***Proxy Pattern Demo***\n");
		Proxy px = new Proxy();
		px.doSomeWork();
	}
	
}

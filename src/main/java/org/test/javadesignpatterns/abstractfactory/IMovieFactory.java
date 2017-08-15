package org.test.javadesignpatterns.abstractfactory;

public interface IMovieFactory 
{

	ITollywoodMovie GetTollywoodMovie();
	IBollywoodMovie GetBollywoodMovie();
	
}

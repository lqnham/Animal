package main.animal;

import main.animal.action.interfaces.WalkInterface;

public class Animal implements WalkInterface{

	@Override
	public void walk() {
		System.out.println("I am walking");
	}
  
  
}

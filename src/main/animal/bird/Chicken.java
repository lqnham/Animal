package main.animal.bird;

import main.animal.action.interfaces.SingInterface;

public class Chicken implements SingInterface{

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
		
	}
	
}

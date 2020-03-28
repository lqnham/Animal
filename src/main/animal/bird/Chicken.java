package main.animal.bird;

import main.animal.action.interfaces.SingInterface;
import main.animal.action.interfaces.SwimInterface;

public class Chicken implements SingInterface{

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
		
	}
	
}

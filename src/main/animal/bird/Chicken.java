package main.animal.bird;

import main.animal.Animal;
import main.animal.action.interfaces.SingInterface;

public class Chicken extends Animal implements SingInterface{

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
		
	}
	
}

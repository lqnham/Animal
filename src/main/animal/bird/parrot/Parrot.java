package main.animal.bird.parrot;

import main.animal.Animal;
import main.animal.action.interfaces.SingInterface;

public class Parrot extends Animal implements SingInterface{
	
	@Override
	public void sing() {
		System.out.println("default sound");
	}
}

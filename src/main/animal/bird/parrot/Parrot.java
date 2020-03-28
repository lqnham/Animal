package main.animal.bird.parrot;

import main.animal.action.interfaces.SingInterface;

public abstract class Parrot implements SingInterface{
	
	public void sound() {
		System.out.println("default sound");
	}
}

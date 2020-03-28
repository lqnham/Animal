package main.animal.bird;

import main.animal.Animal;
import main.animal.action.interfaces.FlyInterface;
import main.animal.action.interfaces.SingInterface;

public class Bird extends Animal implements FlyInterface,SingInterface {
	
	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	
	@Override
	public void sing() {
		System.out.println("I am singing");
	}
}

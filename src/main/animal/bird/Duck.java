package main.animal.bird;

import main.animal.action.interfaces.SingInterface;
import main.animal.action.interfaces.SwimInterface;

public class Duck extends Bird implements SingInterface, SwimInterface{
	
	@Override
	public void sing() {
		System.out.println("Quack, Quack");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
}

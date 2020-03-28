package main.animal.bird;

import main.animal.action.interfaces.SingInterface;

public class Rooster implements SingInterface{

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}

}

package main.animal.butterly;

import main.animal.action.interfaces.FlyInterface;

public class Butterfly extends Metamorphosis implements FlyInterface{
	
	@Override
	public void fly() {
	}

	@Override
	protected boolean canMetamorphose(int numberOfDays) {
		return numberOfDays > 5;
	}

	@Override
	protected void doMetamorphosing(Processing process) {
		 System.out.println("Processing for Butterfly" + process.getDays() + " days to become Butterfly");
	}
}

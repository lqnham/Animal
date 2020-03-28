package main.animal.butterly;

import main.animal.action.interfaces.WalkInterface;

public class Caterpillar extends Metamorphosis implements WalkInterface{

	
	@Override
	public void walk() {
		
	}

	@Override
	protected boolean canMetamorphose(int numberOfDays) {
		return numberOfDays <= 5;
	}

	@Override
	protected void doMetamorphosing(Processing process) {
		System.out.println("Processing for Caterpillar" + process.getDays() + " days to stay at Caterpillar");
	}

}

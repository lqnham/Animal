package main.animal.fish;

import main.animal.fish.properties.Action;
import main.animal.fish.properties.Color;
import main.animal.fish.properties.Size;

public class Shark extends Fish{
	
	public Shark() {
	}
	
	public Shark(Color color, Size size, Action action) {
		color = Color.GREY;
		size = Size.LARGE;
		action = Action.EAT_OTHER;
	}
	
}

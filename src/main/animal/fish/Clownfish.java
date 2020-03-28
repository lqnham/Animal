package main.animal.fish;

import main.animal.fish.properties.Action;
import main.animal.fish.properties.Color;
import main.animal.fish.properties.Size;

public class Clownfish extends Fish{
	
	public Clownfish() {
	}
	
	public Clownfish(Color color, Size size, Action action) {
		color = Color.ORANGE;
		size = Size.SMALL;
		action = Action.JOKE;
	}

	
}

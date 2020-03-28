package main.animal.fish;

import main.animal.Animal;
import main.animal.action.interfaces.SwimInterface;
import main.animal.fish.properties.Action;
import main.animal.fish.properties.Color;
import main.animal.fish.properties.Size;

public class Fish extends Animal implements SwimInterface{
	private Size size;
	private Color color;
	private Action action;
	
	@Override
	public void swim() {
		
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}

}

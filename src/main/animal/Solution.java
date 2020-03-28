package main.animal;

import main.animal.action.interfaces.FlyInterface;
import main.animal.action.interfaces.SingInterface;
import main.animal.action.interfaces.SwimInterface;
import main.animal.action.interfaces.WalkInterface;
import main.animal.bird.Bird;
import main.animal.bird.Chicken;
import main.animal.bird.Duck;
import main.animal.bird.Rooster;
import main.animal.bird.parrot.Parrot;
import main.animal.bird.parrot.ParrotNearCat;
import main.animal.bird.parrot.ParrotNearDog;
import main.animal.bird.parrot.ParrotNearDuck;
import main.animal.butterly.Butterfly;
import main.animal.fish.Clownfish;
import main.animal.fish.Fish;
import main.animal.fish.Shark;
import main.animal.fish.another.Dolphin;

public class Solution {
	private static Animal[] animals= new Animal[]{
			 new Bird(),
			 new Duck(),
			 new Chicken(),
			 new Rooster(),
			 new Fish(),
			 new Shark(),
			 new Clownfish(),
			 new Dolphin(),
			 new Parrot(),
			 new ParrotNearCat(),
			 new ParrotNearDog(),
			 new ParrotNearDuck()};
	 int flyingAnimal = 0;
     int walkingAnimal = 0;
     int singAnimal = 0;
     int swimingAnimal = 0;
     
	public static void main(String[] args) {
		 Bird bird = new Bird();
		 bird.walk();
		 bird.fly();
		 bird.sing();
	}
	
	public void count() {
	    for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof FlyInterface) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof WalkInterface) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof SingInterface) {
            	singAnimal += 1;
            }
            if (animals[i] instanceof SwimInterface) {
                swimingAnimal += 1;
            }
        }
	    
	    
	}
}

package main.animal.butterly;

public class ButterflyLifeCircle {
	public static Metamorphosis getButterfly() {
		Metamorphosis caterpillar = new Caterpillar();
		Metamorphosis butterfly = new Butterfly();
		caterpillar.setNext(butterfly);
		return caterpillar;
	}
}

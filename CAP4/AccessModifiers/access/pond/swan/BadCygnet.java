package access.pond.swan;

import access.pond.duck.MotherDuck;

public class BadCygnet {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		//duck.quack(); // DOES NOT COMPILE // default
		//System.out.println(duck.noise); // DOES NOT COMPILE //default
	}
}
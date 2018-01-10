package accessprotected.pond.inland;

import accessprotected.pond.shore.Bird;

public class BirdWatcherFromAfar {
	public void watchBird() {
		Bird bird = new Bird();
		//bird.floatInWater(); // DOES NOT COMPILE // protected no visualiza fuera del paquete a menos que sea herencia
		//System.out.println(bird.text); // DOES NOT COMPILE
	}
}

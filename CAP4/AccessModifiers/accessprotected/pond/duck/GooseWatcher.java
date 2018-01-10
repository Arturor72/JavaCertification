package accessprotected.pond.duck;

import accessprotected.pond.goose.Goose;

public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
		//goose.floatInWater(); // DOES NOT COMPILE
	}
}
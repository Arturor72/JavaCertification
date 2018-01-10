package accessprotected.pond.goose;

import accessprotected.pond.shore.Bird;

public class Goose extends Bird {
	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}

	public void helpOtherGooseSwim() {
		Bird other = new Goose();
		//other.floatInWater(); // DOES NOT COMPILE // La referencia es Bird que no puede acceder a los miembros protegidos de Bird desde otro paquete
		//System.out.println(other.text); // DOES NOT COMPILE
	}
}
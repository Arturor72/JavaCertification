package accessprotected.pond.swan;

import accessprotected.pond.shore.Bird;

public class Swan extends Bird { // but subclass of bird
	public void swim() {
		floatInWater(); // package access to superclass
		System.out.println(text); // package access to superclass
	}

	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
		System.out.println(other.text);// package access to superclass
	}

	public void helpOtherBirdSwim() {
		Bird other = new Bird(); 
		//other.floatInWater(); // DOES NOT COMPILE //No se puede acceder a los atributos protegidos desde otro paquete usando Bird ya que no hereda ni esta en el mismo paquete que Bird
		//System.out.println(other.text); // DOES NOT COMPILE
	}
}

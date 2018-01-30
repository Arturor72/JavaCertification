
public class Autoboxing {

	public static void main(String...args) {
		
		fly(3); // Java buscará el método más específico para llamar, en este caso el literal 3 seria int
		fly(Integer.valueOf("3")); // El metodo valueOf devuelve un Wrapper
		fly(Integer.parseInt("3")); //El metodo parseInt devuelve un int
									// Recordar que java evitara hacer autoboxing si no es necesario
	}
	public static void fly(Integer numMiles) {
		System.out.println("Integer numMiles: "+numMiles);
	}
	public static void fly(int numMiles) {
		System.out.println("int numMiles: "+numMiles);
	}
	
}

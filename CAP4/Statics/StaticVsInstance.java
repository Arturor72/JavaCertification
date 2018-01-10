
public class StaticVsInstance {

	private String name="StaticVsInstance class";
	
	public static void first() {}
	public static void second() {
		//System.out.println(name); // No se puede usar una varible no estatica en un metodo estatico
	}
	public void third() { System.out.println(name);}
	
	public static void main(String...args) {
		first();
		second();
		//third(); // No es un metodo estatico
		new StaticVsInstance().third(); // Crear una instancia es lo correcto
	}
}

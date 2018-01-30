
import static java.util.Arrays.asList; // siempre la sintaxis es import static no al contrario.
										// se producirá un error de compilación, si importamos miembros estáticos con el mismo nombre o firma.
import java.util.List;

public class StaticsImports {
	public static void main(String[] args) {
		//import static solo sirve para importar miembros estáticos de una clase
		// recomendable cuando se usará mucho un miembro estático de una clase.
		// importar un miembro estático no significa importar toda la clase.
		List<String> list=asList("one","two");
		for (String string : list) {
			System.out.println(string);
		}
	}
}

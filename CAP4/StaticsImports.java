
import static java.util.Arrays.asList; // siempre la sintaxis es import static no al contrario.
										// se producir� un error de compilaci�n, si importamos miembros est�ticos con el mismo nombre o firma.
import java.util.List;

public class StaticsImports {
	public static void main(String[] args) {
		//import static solo sirve para importar miembros est�ticos de una clase
		// recomendable cuando se usar� mucho un miembro est�tico de una clase.
		// importar un miembro est�tico no significa importar toda la clase.
		List<String> list=asList("one","two");
		for (String string : list) {
			System.out.println(string);
		}
	}
}


public class Constructor {
	private int weight;
	private String color;

// No se puede llamar a un constructor sin la palabra reservada new
//	public Constructor(int weight) {
//		Constructor(weight, "brown");
//	}


// Aqui compila pero se esta creando un nuevo objecto al "aire".
//	public Constructor(int weight) {
//		new Constructor(weight, "brown");
//	}
 
// Forma correcta de llamar a otro constructor usando this()
	public Constructor(int weight) {
//		System.out.println("XD"); //para llamar a this() debe ser la primera linea no comentada en el constructor
		this(weight,"Brown");
	}

	public Constructor(int weight, String color) {
		this.weight=weight;
		this.color=color;
	}
	
	public static void main(String... args) {
		Constructor c=new Constructor(10);
		System.out.println(c.weight);
		System.out.println(c.color);
	}
}

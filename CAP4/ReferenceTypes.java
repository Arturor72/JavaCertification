
public class ReferenceTypes {

	public static void main(String args[]) {
		fly("test"); // debido a que java busca el metodo mas específico, encuentra String
		
		fly(56); // Al principio busca un int, luego hace autoboxing a Integer, No encuntra a Integer busca a Object
		
		
	}
	public static void fly(Object o) {
		System.out.println("Object ");
	}
	public static void fly(String s) {
		System.out.println("String ");
	}
}

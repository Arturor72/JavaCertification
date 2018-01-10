
public class Statics {

	static int count;
	public static void main(String...args) {
		Statics statics=new Statics();
		System.out.println(statics.count);
		statics=null;
		System.out.println(statics.count); // No importa si la referencia es nula, existe la variable de clase (estatica)
		
	}
}

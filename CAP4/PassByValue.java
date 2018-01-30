//Java es un lenguaje que pasa sus parámetros por valor, siempre y cuando sean primitivos
// Si son objetos java envía hace una copia de la referencia, que apunta al mismo objeto.

public class PassByValue {

	public static void main(String ...args) {
		int num=4;
		newNumer(num);
		System.out.println(num);
		
		String name="Webby";
		speak(name);
		System.out.println(name);
		
		StringBuilder nameBuilder=new StringBuilder();
		speakBuilder(nameBuilder);
		System.out.println(nameBuilder);
		
	}
	public static void newNumer(int num) {
		 num=8;
	}
	
	public static void speak(String name) {
		name="Spaky";
	}
	
	public static void speakBuilder(StringBuilder s) {
		s.append("Webby");		
	}
}

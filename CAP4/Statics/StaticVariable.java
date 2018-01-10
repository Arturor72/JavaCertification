
public class StaticVariable {

	public static void main(String[] args) {
		Koala koala1=new Koala();
		Koala koala2=new Koala();
		koala1.count=1;
		koala2.count=6;
		Koala.count=3;
		koala1.count=9;
		System.out.println(koala2.count); // Todas las referencias cambian el valor de la variable estatica
		
	}
	
}

class Koala{
	
	public static int count;
	
}

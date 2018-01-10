
public class MethodVarArgs {
	public static void main(String args[]) {
		walkTest(1);
		walkTest(1,2);
		walkTest(1,2,3);
		walkTest(1, new int[] {4,5});
		
	}
	public void walk1(int... nums) {}
	public void walk2(int start, int... nums) {}
	//public void walk3(int...nums, int start) {} // El argumento variable tiene que ir al final
	//public void walk4(int...start, int...nums) {} // Solo puede existir un argumento variable
	
	public static void walkTest(int start, int...num) {
		System.out.println(num.length);  //Java convierte internamente el argumento variable a un arreglo
	}
}

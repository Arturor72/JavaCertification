
// More specific and java doesn't make two steps of transformation
public class OverloadingTricks{

	//First especific int i, int j
	//Convierte a un primitivo mas largo, nunca mas corto (long i, long j)
	//Hace autoboxing, solo puede realizar o la conversion a primitivo o el autoboxing, solo una operacion (Integer i, Integer j)
    // Si al hacer autoboxing no encuentra al tipo especifico hace herencia hasta llegar a Object
	// Si no encuentra ninguno de estos casos, finalmente va al varargs
	public static void main(String args[]){
        
        glide(1,2);
    
    }

    public static void glide(int i, int j){
        System.out.println("int i, int j");
    }
    public static void glide(long i, long j){
        System.out.println("long i, long j");
    }

    public static void glide(Integer i, Integer j){
        System.out.println("Integer i, Integer j");
    }

    public static void glide(Number i, Number j) {
    	System.out.println("Number i, Number j");
    }
    public static void glide(Object i, Object j) {
    	System.out.println("Object i, Object j");
    }
    
    public static void glide(int... nums){
        System.out.println("int... nums");
    }
    
    
//    public static void glide(Long i, Long j) {
//    	System.out.println("Long i, Long j");
//    }
}
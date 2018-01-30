// More specific and java doesn't make two steps of transformation
public class OverloadingTricks{

    public static void main(String args[]){
        
        glide(1,2);
    
    }

/*    public static void glide(int i, int j){
        System.out.println("int i, int j");
    }

    public static void glide(long i, long j){
        System.out.println("long i, long j");
    }
*/
    public static void glide(Integer i, Integer j){
        System.out.println("Integer i, Integer j");
    }

    public static void glide(int... nums){
        System.out.println("int... nums");
    }
}

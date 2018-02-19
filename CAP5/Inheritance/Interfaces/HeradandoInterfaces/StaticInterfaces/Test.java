public class Test implements Hop{
    static int getJumpHeight(){
        return 10;
    }
    public static void main(){
        Hop xy=new Test();
        System.out.println(xy.getJumpHeight());
    }

}

public class TestArrayIndexOutBoundException{
    public static void main(String...args){
        //Esta RuntimeException se lanza al querer acceder a un indice que no existe
        int[] countsOfMoose=new int[3];
        System.out.println(countsOfMoose[-1]);
        System.out.println(countsOfMoose[3]);
    
    }

}

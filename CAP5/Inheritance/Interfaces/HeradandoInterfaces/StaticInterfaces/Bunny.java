// Para referenciar a un metodo estatico, se hace usando el nombre de la interface
public class Bunny implements Hop{
    public void printDetails(){
        System.out.println(Hop.getJumpHeight());
    
    }
    public static void main(String... args){
        Bunny bunny=new Bunny();
        bunny.printDetails();
    
    }

}

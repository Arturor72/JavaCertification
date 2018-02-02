public class Panda extends Bear{

    public static void sneeze(){
        System.out.println("Panda bear sneezes quietly");
    }
    //public  void sneeze(){ // Tiene que ser static como el metodo padre para que sea Hiden
    //    System.out.println("Panda bear sneezes quietly");
    //}
    
    //public static void hibernate(){ // Tiene que no ser estatico para hacer Overriding
    //    System.out.println("Panda bear is going to sleep");
    //}
    public void hibernate(){
        System.out.println("Panda bear is going to sleep");
    }


    public static void main(String...args){
        sneeze();
        new Panda().hibernate();
        //super.hibernate();
    
    }

}

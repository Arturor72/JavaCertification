// Cuando se oculta(hide) un metodo usando el modificador static el metodo oculto
// sera llamado de acuerdo donde se llame al metodo
public class Kangaroo extends Marsupial{
    public static boolean isBiped(){
        return true;
    }

    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on two legs: "+ isBiped());
    }
    public static void main(String...args){
        Kangaroo kang=new Kangaroo();
        kang.getMarsupialDescription();
        kang.getKangarooDescription();
    }    

}

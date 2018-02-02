// Cuando se sobreescribe un metodo, siempre sera llamado el metodo sobreescrito en la clase hija 
public class Kangaroo extends Marsupial{
    public boolean isBiped(){
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

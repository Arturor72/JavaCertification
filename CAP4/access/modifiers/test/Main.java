package access.modifiers.test;
import access.modifiers.ext.Swam;

public class Main{

    public static void main(String... args){
        System.out.println("Hello");
        Swam swam=new Swam();
        swam.swim();
        System.out.println(swam.text);
    
    }

}

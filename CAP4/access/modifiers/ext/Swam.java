package access.modifiers.ext;

import access.modifiers.protect.Bird;

public class Swam extends Bird{

    public void swim(){
        floatInWater();
        System.out.println(text);
    }
/*    public void helOtherBirdSwim(){
        Bird other =new Bird();
        other.floatInWater();
        System.out.println(other.text);
    }*/

}

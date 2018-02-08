// Polimorfismo: La capacidad de un objecto de tomar diferentes formas
// de acuerdo como sea referenciado (desde una superclase, interface)
public class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }

    public int age=10;
    public static void main(String... args){
        Lemur lemur=new Lemur();// El objeto Lemur existe como tal en memoria, los metodos y atributos 
                                // estaran disponibles de acuerdo a la referencia
        System.out.println(lemur.age);// El atributo age esta disponible para la referencia Lemur

        HasTail hasTail=lemur;// La referencia es una interface, solo tiene acceso al metodo isTailStriped()
        System.out.println(hasTail.isTailStriped());
        //System.out.println(hasTail.age); // La referencia no conoce el atributo age
        Primate primate=lemur;
        System.out.println(primate.hasHair());
        //System.out.println(primate.isTailStriped()); // La referencia no conoce el metodo 

    }



}

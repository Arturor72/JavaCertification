// 1. Castear un objeto de una subclase a una superclase no requiere un cast explicito
// 2. Castear un objeto de una superclase a una subclase requiere un cast explicito
// 3. El compilador no permitira casteos de tipos que no esten relacionados
// 4. En un cast explicito puede presentarse una exception en tiempo de ejecucion si la subclase no es una instancia de la superclase
public class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }

    public int age=10;
    public static void main(String... args){
        Lemur lemur=new Lemur();
        Primate primate=lemur; // Se hace un cast implicito si se asigna un objeto de una subclase a una superclase

        //Lemur lemur2=primate //No se puede asignar un objeto de una superclase a una subclase sin usar un cast explicito

        Lemur lemur3=(Lemur)primate;//usando un cast explicito
        System.out.println(lemur3.age);
        


    }



}

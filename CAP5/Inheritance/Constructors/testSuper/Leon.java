public class Leon extends Felino{
    public Leon(){
        // Aqui en tiempo de compilacion java llamara al constructor por defecto super()
        this(2);
        System.out.println("Leon Constructor");
    }
    public Leon(int a){
        super(a);
        System.out.println("Overloading Leon Constructor "+a);
    }

    public static void main(String... args){
        new Leon();
    
    }

}

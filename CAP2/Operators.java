public class Operators{


    // Reglas de la promocion numerica: 
    // 1.- Si dos valores tienen diferente tipo de datos, Java automaticamente
    // transformara uno de los valores al tipo de dato mas grande de ambos operandos
    // 2.- Si uno de los valores es entero y el otro punto flotante, transformara
    // el entero a un punto flotante
    // 3.- Tipos de datos cortos como byte, short y char primero son transformados
    // a enteros 
    // 4.- Despues de que han ocurrido todas las promociones el resultado
    // sera del mismo tipo de dato al que fueron transformados.


    public static void main(String args[]){
        numericPromotion();

        unaryOperators();

        logicalOperators();

        compareOperator();
    }

    private static void  numericPromotion(){
        System.out.println("Numeric Promotion of int to double (9/3.0) : " + (9/3.0));
        byte b1=9;
        System.out.println("Numeric Promotion of byte to double (9/3.0) : " + (b1/3.0));
        short s1=9;
        System.out.println("Numeric Promotion of short  to double (9/3.0) : " + (s1/3.0));

        short s2=10;
        short s3=3;
        //short s4=s2/s3; //Incompatible types
        System.out.println("Numeric Promotion of short to int (10/3) : " + (s2/s3));
        s2/=s3;
        System.out.println("Numeric Promotion of short to short composed /= (10/3) : " + s3);

        short x=14;
        float y=13;
        double z=30;

        System.out.println("All rules of promote: "+ (x*y/z));
    }


    private static void unaryOperators(){
        int count=0;

        System.out.println("count: "+ count);
        System.out.println("++count: "+ (++count));
        System.out.println("count: "+ count);
        System.out.println("count--: "+ (count--));
        System.out.println("count: "+count);

        int x=3;
        int y =++x * 5/x-- + --x;
        System.out.println("El valor de x: "+x);
        System.out.println("El valor de y: "+y);

        int x1=3;
        int y1=x1=1;

        System.out.println("El valor de x1: "+x1);
        System.out.println("El valor de y1: "+y1);
    }

    private static void logicalOperators(){
        System.out.println("Short Circuit && and || ");
        int y=5;
        boolean x=true || (y<4);

        int x1=6;
        boolean y1=(x1<=6) || (++x1<=7);
        System.out.println(x1);
    }

    private static void compareOperator(){
        //Dos referencias son iguales si y solo si estas apuntan
        //al mismo objecto o ambas apuntan a null
        boolean y=(true==false);
        System.out.println(y);
    }

}

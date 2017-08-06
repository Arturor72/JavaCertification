//Nota: el operador == en objectos compara si tienen la misma referencia
//el metodo equals() obecede al override de la clase en cuestion
//en la clase String el metodo equals esta implementado para comprar
//los valores

public class EqualityString{
    public static void main(String args[]){
        firstExample();
        secondExample();
        thirdExample();
        fourthExample();
    }

    private static void firstExample(){
        printCabecera("First Example");
        String x="Hello World";
        String y="Hello World";
        System.out.println(x==y);
    }

    private static void secondExample(){
        printCabecera("Second Example");
        String x="Hello World";
        String z=" Hello World".trim(); //Procesado en tiempo de ejecucion
        String z2="Hello World".trim();
        System.out.println(x==z);
        System.out.println(x==z2);
        System.out.println(z==z2);
    }

    private static void thirdExample(){
        printCabecera("Thrid Example");
        String x=new String("Hello World"); //Solicitas un nuevo string, que no es pooled
        String y="Hello World";
        System.out.println(x==y);
    }

    private static void fourthExample(){
        printCabecera("Fourth Example");
        String x="Hello World";
        String z=" Hello World".trim();
        System.out.println("x==z: "+(x==z));
        System.out.println("x.equals(z): "+x.equals(z));
   
    }
    private static void printCabecera(String str){
        System.out.println("=>"+str);
        System.out.println("------------------------");
    }

}

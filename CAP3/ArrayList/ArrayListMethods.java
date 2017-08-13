import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods{
    public static void main(String[] args){
        methodAddTest();

        methodAddIndiceTest();

        methodRemoveTest();

        methodSetTest();

        methodIsEmptyTest();

        methodClearTest();
        
        methodContainsTest();

        methodEqualsTest();
    }

    private static void methodAddTest(){
        printCabecera("Add");
        //Crea una lista de objectos
        //Los ArrayList no aceptan genericos, realizan autoboxing
        ArrayList list=new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list);

    }

    private static void methodAddIndiceTest(){
        printCabecera("Add con Indice");

        List<String> birds=new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds + " size: "+birds.size());
        birds.add(1, "robin");
        System.out.println(birds + " size: "+birds.size());
        birds.add(0, "blue jay");
        System.out.println(birds + " size: "+birds.size());
        birds.add(1,"cardinal");
        System.out.println(birds + " size: "+birds.size());
        birds.add(4,"XD");
        System.out.println(birds + " size: "+birds.size());
    
    }

    private static void methodRemoveTest(){
        printCabecera("Remove");

        List<String> birds=new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println("list birds: "+birds);
        System.out.println("birds.remove(\"cardinal\") " + birds.remove("cardinal"));
        System.out.println("birds.remove(\"hawk\") " + birds.remove("hawk"));
        System.out.println("birds.remove(0) " + birds.remove(0));
        System.out.println("list birds: "+birds);
        //Produce un IndexOutOfBoundsException remove(index) si el indice
        //no existe
    }

    private static void methodSetTest(){
        printCabecera("Set");

        List<String> birds =new ArrayList<>();
        birds.add("hawk");
        System.out.println("birds lista: "+ birds);
        System.out.println("birds size: "+birds.size());
        birds.set(0, "robin");
        System.out.println("birds lista: "+ birds);
        System.out.println("birds size: "+birds.size());
        //birds.set(1. "robin"); produce IndexOutBoundsException
    }

    private static void methodIsEmptyTest(){
        printCabecera("isEmpty");

        List<String> birds=new ArrayList<>();

        System.out.println("birds.isEmpty() "+birds.isEmpty());
        System.out.println("birds.size() "+ birds.size());
        birds.add("hawk");
        birds.add("hawk");
        System.out.println("birds.isEmpty() "+ birds.isEmpty());
        System.out.println("birds.size() "+ birds.size());
    }

    private static void methodClearTest(){
        printCabecera("clear()");
        List<String> birds=new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println("list birds: "+birds);
        System.out.println("birds.isEmpty() "+ birds.isEmpty());
        System.out.println("birds.size() "+ birds.size());
        birds.clear();
        System.out.println("birds.isEmpty() "+ birds.isEmpty());
        System.out.println("birds.size() "+ birds.size());
        System.out.println("list birds: "+birds);


    
    }
    private static void methodContainsTest(){
        printCabecera("contains()");
        List<String> birds=new ArrayList<>();
        birds.add("hawk");
        System.out.println("list birds:" + birds);
        System.out.println("birds.contains(\"hawk\"):" + birds.contains("hawk"));
        System.out.println("birds.contains(\"robin\"):" + birds.contains("robin"));
        System.out.println("list birds:" + birds);

    
    }
    private static void methodEqualsTest(){
        printCabecera("equals()");
        //Verifica si tienen el mismo contenido en el mismo orden
        List<String> one=new ArrayList<>();
        List<String> two=new ArrayList<>();
        System.out.println("one.equals(two): "+one.equals(two));
        one.add("a");
        System.out.println("one.equals(two): "+one.equals(two));
        two.add("a");
        System.out.println("one.equals(two): "+one.equals(two));
        one.add("b");
        two.add(0,"b");
        System.out.println("one.equals(two): "+one.equals(two));
    }
    private static void printCabecera(String method){
        System.out.println("");
        System.out.println("==============================");
        System.out.println("Metodo "+ method);
        System.out.println("==============================");
        System.out.println("");
    
    }

}

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertBetweenArrayAndList{
    public static void main(String[] args){
    
        convertListToArray(); 

        convertArrayToList();

        varArgsAsList();
    }

    private static void convertListToArray(){
        printCabecera("convertListToArray");
        List<String> list=new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray=list.toArray();
        System.out.println("Object array length: "+objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        //El metodo toArray recibe como parametro el tipo de array que devolvera
        //Se coloca el tama;o 0 para que Java automaticamente calcule el
        //size del array devuelto, si el size es mayor, ese tam;o tomara el array
        System.out.println("String Array length: "+stringArray.length);
    }

    private static void convertArrayToList(){
        printCabecera("convertArrayToList");
        String[] array={"hawk","robin"};
        List<String> list=Arrays.asList(array); // devuelve un backed list
        //esta lista esta enlazada al array, si uno cambio el otro tambien
        //se pueden setear elementos pero no se puede extender ni reducir
        //el tama;o del array
        System.out.println("list size: " +list.size());
        list.set(1, "test");
        array[0]="new";
        for(String b: array)
            System.out.println(b+ " ");
        //list.add("add");
        //list.remove(1);
    }

    private static void varArgsAsList(){
        printCabecera("varArgs asList()");
        List<String> list=Arrays.asList("one", "two");
        System.out.println("Varargs asList list "+list);
    
    }

   private static void printCabecera(String example){
        System.out.println("=====================");
        System.out.println("Ejemplo "+ example);
        System.out.println("=====================\n");
   }



}

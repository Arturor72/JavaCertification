import java.util.List;
import java.util.ArrayList;

public class ArraysAutoboxing{
    public static void main(String[] args){
        autoboxingExample();

        autoboxingExample2();

        removeIntegersExample();
    
    }

    private static void autoboxingExample(){
        List<Double> weights=new ArrayList<>();
        System.out.println("List weights: "+ weights);
        weights.add(50.5); //Autoboxing
        System.out.println("List weights: "+ weights);
        weights.add(new Double(60));
        System.out.println("List weights: "+ weights);
        weights.remove(50.5);
        System.out.println("List weights: "+ weights);
        double first=weights.get(0); //Unboxing
        System.out.println("double =weights.get(0): "+ first);

        
    }

    private static void autoboxingExample2(){
        List<Integer> heights=new ArrayList<>();
        heights.add(null); //Se puede agregar null a un Wrapper
        // int h=heights.get(0);  //NullPointerException cuando quiere hacer unboxing
    
    }

    private static void removeIntegersExample(){
        printCabeceras("removeIntegersExample");

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        //Elimina el indice ya que remove recibe como parametro un primitivo
        //Si se requiere eliminar un numero especifico de tipo integer
        //pasar como parametro un Wrapper por ejemplo remove.(new Integer(2))

    }

    private static void printCabeceras(String example){
        System.out.println("========================");
        System.out.println("Ejemplo: "+example);
        System.out.println("========================");


    
    }





}

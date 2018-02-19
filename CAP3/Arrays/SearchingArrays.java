//Notas: 
//Si el elemento es encontrado entonces retorna su indice
//Si el elemento no es encontrado, retorna el indice donde deberia ser
//colocado para preservar el orden (niega el indice donde debe estar y le resta
//1)
//El arreglo debe estar ordenado de menor a mayor

import java.util.Arrays;

public class SearchingArrays{
    public static void main(String[] args){
        int[] numbers={2,4,6,8} ;
        //int[] numbers={8,6,4,2} ; // No de mayor a menor
        System.out.println(Arrays.binarySearch(numbers,2));
        System.out.println(Arrays.binarySearch(numbers,4));
        System.out.println(Arrays.binarySearch(numbers,1)); //Deberia ir en la posicion 0, se niega y se resta 1 => -1
        System.out.println(Arrays.binarySearch(numbers,3)); //Deberia ir en la posicion 1, se niega(-1) y resta 1 => -2 
        System.out.println(Arrays.binarySearch(numbers,9)); //Deberia ir en la posicion 4, se niega(-4) y resta 1 => -5
    }
}

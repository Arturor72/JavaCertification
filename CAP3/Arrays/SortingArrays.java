import java.util.Arrays;

public class SortingArrays{
    public static void main(String[] args){
        int[] numbers={6,9,1} ;
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        String[] strings={"10","9","100"};
        Arrays.sort(strings);
        for(String string: strings){
            System.out.println(string);
        }
        String[] strings2={"1A","9B","100000C","A2","99","*"};
        Arrays.sort(strings2);
        for(String string: strings2){
            System.out.println(string);
        }
    }



}

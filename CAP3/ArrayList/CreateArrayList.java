import java.util.List;
import java.util.ArrayList;

//Ejecuta con warnings debido a la declaracion de la lista 4 
//usando el generico en la parte derecha
public class CreateArrayList{
    public static void main(String[] args){
        ArrayList list1=new ArrayList();
        ArrayList list2=new ArrayList();
        ArrayList list3=new ArrayList(list2);//Copia del ArrayList2

        //A partir de Java5 se introdujeron los genericos
        ArrayList<String> list4=new  ArrayList<String>();
        //A parti de Java7 se obvia la declaracion del generico en el constructor
        ArrayList<String> list5=new ArrayList<>();
        //ArrayList es una implementacion de List
        List<String> list6=new ArrayList<>();
        //ArrayList<String> list7=new List<>(); // No compila 



    }


}

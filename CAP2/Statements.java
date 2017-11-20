public class Statements{

    public static void main(String args[]){
        ifStatement();
        ternaryOperator();
        switchStatement();
        forStatement();
        forEachStatement();
   }


   private static void ifStatement(){
    printCabecera("IfStatement");
    int hourOfDay=10;
    if(hourOfDay<11){
        System.out.println("Good Morning");
    }else{
        System.out.println("Good Afternoon");
    }

    if(hourOfDay>11)
        System.out.println("One Statement");
        System.out.println("Second Statement");
   }

   private static void ternaryOperator(){
    printCabecera("TernaryOperator");
    int y=10;
    int x= y>5?2*y:3*y;
    System.out.println(x);

    //int animal=y<91?9:"Horse"; incompatible types

    //Solo se ejecuta uno
    int y1=1;
    int z1=1;
    final int x1=y1<10?y1++:z1++;

    System.out.println("y1: "+ y1+ " z1: "+ z1);
   }

   private static void switchStatement(){
    printCabecera("Switch Statement");
    //En java 7 Switch soporta wrappers
    //String, Byte, Short, Character, Integer
    //boolean y long no son soportados
    //Los valores en la sentencia case deben ser literales, finales 
    //o enums

    int dayOfWeek=6;
    switch(dayOfWeek){
        default:
            System.out.println("Weekday");
            break;
        case 0:
            System.out.println("Sunday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
    }


    switch(dayOfWeek){
        case 6:
            System.out.println("Weekday");
        case 0:
            System.out.println("Sunday");
        default:
            System.out.println("Saturday");
    }
   }

    private static void forStatement(){
        printCabecera("For Statement");
        for(int i=0; i<10; i++){
            System.out.println(i+"");
        }

        //for(;;){
        //    System.out.println("Infinity loop");
        //}
        System.out.println("------------------");
        int x =0;
        for(long y=0, z=4;x<5 && y<10; x++,y++ ){
            System.out.println(y);

        }
        System.out.println(x);
    }

    private static void forEachStatement(){
        printCabecera("ForEach Statement");
        //La coleccion debe ser un array o un objecto cuya clase
        //implemente java.lang.Iterable
        String[] names=new String[3];
        names[0]="name1";
        names[1]="name2";
        names[2]="name2";
        for(String name: names){
            System.out.println(name+",");
        }

        java.util.List<String> namesList=new java.util.ArrayList<String>();
        namesList.add("name1List");
        namesList.add("name2List");
        namesList.add("name3List");
        for(String name: namesList){
            System.out.println(name+",");
        }
    
    }



    private static void printCabecera(String method){
    System.out.println("");
    System.out.println("==============================");
    System.out.println("Metodo "+ method);
    System.out.println("==============================");
    System.out.println("");
    }

}

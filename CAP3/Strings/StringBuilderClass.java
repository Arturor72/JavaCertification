public class StringBuilderClass{

    //Nota: StringBuffer se usaba antes de la introduccion de_
    //StringBuilder en Java 5, StringBuffer hacer lo mismo pero es 
    //mas lento debido a que es Thread safe.
    public static void main(String args[]){
        
        String principal="animals";
        System.out.println("String principal: "+principal);


        createMultipleStrings();
         
         stringBuilderTests();

         mutabilityTests();

         commonMethods();

         insertTests(principal);

         deleteTests(principal);

         reverseTests(principal);
    
    }
    public static void stringBuilderTests(){
        //StringBuilder  no es una clase inmmutable
        StringBuilder alpha=new StringBuilder();
        for(char current='a'; current<='z'; current++)
            alpha.append(current);
        System.out.println(alpha);
    }
    public static void createMultipleStrings(){
        //27 strings son instanciados, de los cuales la mayoria son elegidos
        //para ser eliminados por el garbageCollector
        String alpha="";
        for(char current='a'; current<='z'; current++)
            alpha+=current;
        System.out.println(alpha);
    }

    public static void mutabilityTests(){
        StringBuilder a=new StringBuilder("abc");
        StringBuilder b=a.append("de");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a.append("fg");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        b.append("hi");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        StringBuilder c=new StringBuilder("abcdefghi");
        System.out.println("c: "+c);
        System.out.println("a==b: "+(a==b));
        System.out.println("a==c: "+(a==c));
    }

    public static void commonMethods(){
        System.out.println("Common Methods: charAt(), indexOf(), length(), substring()");
        StringBuilder sb=new StringBuilder("animals");
        String sub=sb.substring(sb.indexOf("a"),sb.indexOf("al"));
        int len=sb.length();
        char ch=sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }

    public static void insertTests(String principal){
        //inserta str en el indice offset
        printCabecera("=> insert(int offset, String str)");
        StringBuilder sb=new StringBuilder(principal);
        System.out.println("sb.insert(7,\"-\"): " + sb.insert(7,"-"));
        System.out.println("sb.insert(0,\"-\"): " + sb.insert(0,"-"));
        System.out.println("sb.insert(4,\"-\"): " + sb.insert(4,"-"));
    }

    public static void deleteTests(String principal){
        //delete(int start, int end) elimina desde el indice start hasta end-1
        //deleteCharAt(int index) elimina el caracter que se encuentra en el indice index
        printCabecera("=> delete and deleteCharAt");
        StringBuilder sb=new StringBuilder(principal);
        System.out.println("sb.delete(1,3): " + sb.delete(1,3));
        System.out.println("sb.deleteCharAt(4): " + sb.deleteCharAt(4));
    }

    public static void reverseTests(String principal){
        printCabecera("=> reverse");
        StringBuilder sb=new StringBuilder(principal);
        sb.reverse();
        System.out.println(sb);
    }

    public static void printCabecera(String methods){
        System.out.println("-----------------------------");
        System.out.println(methods+" METHOD");
    }


}

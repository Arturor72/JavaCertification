public class ArraysReference{
    public static void main(String[] args){
        String [] bugs={"cricket", "beetle", "ladybug"};
        String [] alias=bugs;
        System.out.println("bugs==alias: "+ (bugs==alias));
        System.out.println("bugs.equals(alias): " + bugs.equals(alias));
        System.out.println(bugs);
        System.out.println(bugs.toString());
        //Los arreglos no almacenan el objeto en si, ellos almacenan las re_
        //ferencias hacia ellos
        String a="cricket";
        System.out.println(a==bugs[0]);
    
    }

}

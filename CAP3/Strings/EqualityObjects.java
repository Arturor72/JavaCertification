public class EqualityObjects{
    public static void main(String args[]){
       Tiger t1=new Tiger();
       Tiger t2=new Tiger();
       Tiger t3=t1;
       System.out.println(t1==t1);
       System.out.println(t1==t2);
       System.out.println(t1==t3);
    }


}

class Tiger{
    String name;

}

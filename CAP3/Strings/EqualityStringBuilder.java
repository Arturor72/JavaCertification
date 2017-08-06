public class EqualityStringBuilder{
    public static void main(String args[]){
        StringBuilder one=new StringBuilder();
        StringBuilder two=new StringBuilder();
        StringBuilder three=one.append("a");
       //objetos totalmente diferentes 
        System.out.println("one==two: " + (one==two)); 
       //apuntan al mismo objecto 
        System.out.println("one==three: " + (one==three)); 
        
    }


}

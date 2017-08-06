//String pool is a location in the JVM that collects all these strings
//String pool contains literal values
// myObject.toString() is a string but not a literal

public class StringPool{

    public static void main(String args[]){
        //Use string poll normally
        String name="Hello";

        //I really don't want you to use the string pool. Create a new object for me (less efficient)
        String name2=new String("Hello");

        //Compare objects
        System.out.println(name==name2);
        //Compare literals
        System.out.println(name.equals(name2));
    }

}


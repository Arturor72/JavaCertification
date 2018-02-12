public class TestNullPointerException{
    String name;
    public void printLength() throws NullPointerException{    
        System.out.println(name.length());
    }

    public static void main(String...args){
        TestNullPointerException test=new TestNullPointerException();
        //Excepcion que se produce cuando usamos una referencia que apunta a un objecto nulo
        test.printLength();
    
    }

}

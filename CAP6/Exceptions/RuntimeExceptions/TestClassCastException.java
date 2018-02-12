public class TestClassCastException{
    public static void main(String...args){
        String type="moose";
        // Integer number=(Integer) type; //Error por tipo de dato
        Object obj=type;
        Integer number=(Integer)obj; // En tiempo de ejecucion al realizar un cast indebido

    
    }

}

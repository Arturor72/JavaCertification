public class TellException{
    
    public static void main(String...args){
        try{
            System.out.println("Try Block");
             throw new RuntimeException();
        }catch(RuntimeException e){
            System.out.println("Catch Block");
            throw new RuntimeException();
        }finally{
            System.out.println("Finally Block");
            //throw new RuntimeException("Ocultando RuntimeException"); // Oculta la verdadera exception, siempre se debe usar un bloque try catch dentro de este bloque
        }
    }


}

// Throwable -> Exception
// Throwable -> Error
// Exception -> RuntimeException
// Existen dos tipos de exception : checked exceptions y unchecked exception
// unchecked exception: generalmente extiende de RuntimeException, excepciones que se generan en tiempo de ejecucion
// check exception: se controlan en tiempo de desarrollo y compilacion.
// Los bloques catch se ejecutan en el orden que aparecen y siempre desde las subclases hacia clases padre
// Finally siempre se ejecutara, a menos que exista System.exit()
public class TellException{
    public void fall() throws Exception{
        System.out.println("Falling");
    } 


    public static void main(String... args){
        try{
            System.out.println("Trying");
            new TellException().fall();
        }catch(Exception e){
            System.out.println("Catching Exception");
        }finally{
            System.out.println("FinallyBlock");
        }
    }
}


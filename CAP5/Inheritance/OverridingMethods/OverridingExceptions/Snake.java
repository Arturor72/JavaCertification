public class Snake extends Reptile{
    protected boolean hasLegs(){
        return false;
    }
    
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }
// Error debido a que lanza una excepcion mas generica
//    protected boolean hasLegs() throws Exception{
//        return false;
//    }
//
}

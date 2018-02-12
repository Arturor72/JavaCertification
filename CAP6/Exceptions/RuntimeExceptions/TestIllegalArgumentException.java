public class TestIllegalArgumentException{
    int numberEggs;
    public  void setNumberEggs(int numberEggs){
        if(numberEggs<0){
            throw new IllegalArgumentException("# eggs must not be negative");
        }
            this.numberEggs=numberEggs;
    
    }

    public static void main(String...args){
        TestIllegalArgumentException test=new TestIllegalArgumentException();
        //Exception que se produce por un argumento no valido para un atributo, debe ser controlado por el programador
        test.setNumberEggs(-2);
    
    }


}

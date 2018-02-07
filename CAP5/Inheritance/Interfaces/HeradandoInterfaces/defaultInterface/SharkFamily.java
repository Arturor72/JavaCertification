public interface SharkFamily extends HasFins{
    //Se puede sobreescribir el metodo default
    public default int getNumberOfFins(){
        return 8;
    }
    //Se puede redefinit un metodo default como un metodo abstracto,
    //la primera clase concreta debe implementar este metodo
    public double getLongestFinLength();

}

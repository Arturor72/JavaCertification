public class Gorilla extends Animal{
    public Gorilla(int age){
        super(age, "Gorilla");// si se requiere llamar a una sobrecarga del
                             // metodo de la clase padre, entonces super debe ser
                             // la primera sentencia a ejectuar en el constructor
    }
    public Gorilla(){
        super(5);
    }
    // Recordar tambien que Java automaticamente agrega una llamada a super() 
    // si no se coloco



}

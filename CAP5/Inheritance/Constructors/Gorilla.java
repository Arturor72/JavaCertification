public class Gorilla extends Animal{
    public Gorilla(int age){
        super(age, "Gorilla");// si se requiere llamar a una sobrecarga del
                             // metodo de la clase padre, entonces super debe ser
                             // la primera sentencia a ejectuar en el constructor
    }
    public Gorilla(){
        super(5);
    }
    // Reglas:  
    // 1. La primera sentencia de todo constructor tiene que ser llamar a this() o super()
    // 2. super() no puede ser usado despues de la primera sentencia del constructor.
    // 3. Si no llamas explicitamente a super(), java lo insertara en tiempo de compilacion.
    // 4. Si el padre no tiene un constructor sin argumentos, y la clase hija no define un constructor 
    //    entonces existira un error.
    // 5. Si la clase padre no tiene un constructor sin argumentos, java requiere que se haga una llamada
    //    explicita al constructor padre en cada constructor hijo



}

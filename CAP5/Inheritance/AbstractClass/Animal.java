//Una clase abstracta puede definir atributos e implementar metodos no abstractos
//Reglas:
//1. Abstract classes no pueden ser instanciadas directamente
//2. Pueden ser definidas con cero metodos abstractos
//3. Las clases abstractas no pueden ser marcadas con final o private
//4. Una clase abstracta que extiende a otra clase abstracta hereda todos los metodos abstractos, no es necesario la implementacion
//5. La primera clase concreta que extiende de una clase abstracta debe implementar todos los metodos abstractos heredados
//a menos que una clase intermedia abstracta haya implementado el metodo.
public abstract class Animal{
    //Si puede contener un constructor
    public Animal(){
        System.out.println("Creando Animal");
    }
    //Reglas Metodo abstracto
    //1. Puede ser definido solo en clases abstractas.
    //2. No puede ser declarado final o privado
    //3. No debe tener implementacion en la clase abstracta.
    //4. La implementacion de un metodo abstracto en una clase concreta
    //   sigue las mismas reglas del "overriding", el nombre y la firma deben ser los mismos, la visibilidad del metodo debe
    //   ser mas accesible en la implementacion.
    public abstract String getName();

}

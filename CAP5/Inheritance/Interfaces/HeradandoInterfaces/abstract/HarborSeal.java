// Una clase abstracta usa la palabra reservada implements para implementar interfaces
// No es necesario que implemente las interfaces(aunque podria hacerlo)
// la primera clase concreta que extienda de la clase abstracta, tiene que implementar
// los metodos no implementados en esta clase.
public abstract class HarborSeal implements HasTail, HasWhiskers{
    public int getTailLength(){
        return 10;
    }


}

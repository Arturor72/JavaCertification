// 1. Una interface no puede ser instanciada directamente
// 2. Una interface no puede tener metodos private
// 3. Una interface no puede ser marcada como final, private o protected
// 4. Las interfaces definen el modificador abstract por defecto. 
// 5. Todos los default metodos en una interface son asumidos como publicos y abstractos
//    Los metodos no pueden ser private, protected o final.
public interface CanFly{
    void fly(int speed);
    // Se transformara a public abstract void fly(int speed);

    abstract void takeOff();
    // Se transformara a public abstrac void takeOff();

    public abstract double dive();
    // Quedara igual


}

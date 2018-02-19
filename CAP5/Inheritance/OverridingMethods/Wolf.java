// 1. El metodo hijo de la clase debe tener la misma firma que el metodo en la clase padre ( firma nombre + parametros)
// 2. El metodo en la clase hija debe ser igual o mas accesible que el metodo de la clase padre.
// 3. El metodo en la clase hija puede no lanzar checkd exceptions que es nueva o mas general 
// que cualquiera exception lanzada por la clase padre.
// 4. Si el metodo retorna un valor, este debe ser el mismo o una subclase del metodo en la clase padre (covariant return types)
public class Wolf extends Canine{

    public long getAverageWeight(){
//        return 2;
        return super.getAverageWeight()+50;
    }

    public static void main(String... args){
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }


}

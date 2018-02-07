// 1. Un metodo default no se asume como static, final o abstract, se puede sobreescribir
// 2. Un metodo default se asume como publico y no compilara si esta marcado como privado o protegido
public interface HasFins{
    // default Methods: Pueden ser implementados en una interface
    // y siguen las mismas reglas sobre overriding
    public default int getNumberOfFins(){
        return 4;
    }

    public default double getLongestFinLength(){
        return 20.0;
    }

    public default boolean doFinsHaveScales(){
        return true;
    }

    //public default boolean doThat(); // Tiene que ser implementado si tiene el modificador default

}

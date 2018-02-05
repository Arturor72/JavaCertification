public class BactrianCamel extends Camel{
   //Ya que la clase padre declara el metodo con la misma firma pero privado
    // la clase hija puede declarar un metodo con la misma firma sin guardar ninguna relacion
    private int getNumberOfHumps(){
        return 2;
    }

}

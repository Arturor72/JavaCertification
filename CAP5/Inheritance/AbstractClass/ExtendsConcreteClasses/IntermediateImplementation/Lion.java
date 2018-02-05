public class Lion extends BigCat{
    //Ya no es necesario implementar el metodo getName de la clase Animal
    //debido a que fue implementado por la clase padre BigCat
    public void roar(){
        System.out.println("The Lion lets out a loud. ROAR!");
    }

    public static void main(String... args){
        Lion lion=new Lion();
        lion.roar();
        System.out.println(lion.getName());
        Animal lanimal=new Lion();
        //lanimal.roar() // la referencia  a la clase Animal no conoce el metodo declarado en la clase Lion
        lanimal.getName();// Si conoce el metodo declarado como metodo abstracto
    }

}

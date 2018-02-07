public class Cat implements Walk, Run{
    //Si existe ambiguedad debido a que las dos interfaces 
    //implementan un metodo default con la misma firma y tipo de retorno
    //la clase puede redefinir el metodo

    public int getSpeed(){
        return 10;
    }

    public static void main(String...args){
        Cat cat=new Cat();
        System.out.println(cat.getSpeed());
    }


}

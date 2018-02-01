class Fish{
    protected int size;
    private int age;

    public Fish(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

public class Shark extends Fish{
    private int numberOfFins=8;
    public Shark(int age){
        super(age);
        this.size=4;
    }

    public void displaySharkDetails(){
        System.out.println("Shark with age: "+ getAge());
        System.out.println(" and  "+size+ " meters long");
        System.out.println(" with "+ numberOfFins+ " fins");
    }

    public void displaySharkDetailsSecond(){
        System.out.println("Shark with age: "+this.getAge());
        System.out.println(" and  "+this.size+ " meters long");
        System.out.println(" with "+ this.numberOfFins+ " fins");
    }

    public void displaySharkDetailsThird(){
        System.out.println("Shark with age: "+ super.getAge());
        System.out.println(" and  "+super.size+ " meters long");
        System.out.println(" with "+ this.numberOfFins+ " fins");
        //System.out.println(" with "+ super.numberOfFins+ " fins"); // Error al intentar acceder a un miembro que no existe en la clase padre
    }
}

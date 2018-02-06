//Es la primera clase concreta que implementa una interface
//debe implementar todos los metodos de las clases padres no concretas
public class SealBaby implements Seal{
    public int getTailLength(){
        return 8;
    }
    public int getNumberOfWhiskers(){
        return 50;
    }
    public static void main(String... args){
        SealBaby baby=new SealBaby();
        System.out.println(baby.getTailLength());
        System.out.println(baby.getNumberOfWhiskers());
        //HasTail hTail=new SealBaby();
        //System.out.println(hTail.getTailLength());
        //System.out.println(hTail.getNumberOfWhiskers());
    }

}

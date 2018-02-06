public class HarborBaby extends  HarborSeal{
    public int getNumberOfWhiskers(){
    
        return 4;
    }

    public static void main(String...args){
        HarborBaby baby=new HarborBaby();
        System.out.println(baby.getNumberOfWhiskers());
        System.out.println(baby.getTailLength());

    }

}

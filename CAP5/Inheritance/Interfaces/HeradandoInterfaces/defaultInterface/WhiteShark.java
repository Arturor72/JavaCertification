public class WhiteShark implements SharkFamily{
    public double getLongestFinLength(){
        return 40.0;
    }

    public static void main(String... args){
        WhiteShark whiteShark=new WhiteShark();
        System.out.println(whiteShark.getLongestFinLength());
        System.out.println(whiteShark.getNumberOfFins());

    
    }

}

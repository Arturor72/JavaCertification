public class ArrayIndex{
    public static void main(String[] args){
        String[] linuxDist={"Debian", "Ubuntu", "Mint"};
        System.out.println("Length"+ linuxDist.length);
        System.out.println(linuxDist[0]);
        System.out.println(linuxDist[1]);
        System.out.println(linuxDist[2]);

        for(int i=0; i<linuxDist.length; i++)
            System.out.println(linuxDist[i]);

        //for(int i=0; i<=linuxDist.length; i++)
        //    System.out.println(linuxDist[i]);
        
        //linuxDist[3]="Centos";
    }

}

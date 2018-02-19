public class MultidimensionalArray{
    public static void main(String... args){
        createArrays1(); 
        differentSizeArray();
        usingMultidimensionalArray();
    }

    private static void createArrays1(){
        int[][] vars1; // 2d
        int vars2 [][]; // 2d
        int [] vars3[]; // 2d
        int[] vars4, space[][]; // 1d and 3d
    }

    private static void differentSizeArray(){
        String[][] multi=new String[3][2];//Array de 3 espacios que almacena 1 array de 2 espacios cada uno
        int[][] differentSize={{1,4},{3},{9,8,7}};
        int[][] args=new int[4][];
        args[0]=new int[5];
        args[1]=new int[3];
    }

    public static void usingMultidimensionalArray(){
        int[][] twoD=new int[3][2];
        for(int i=0; i<twoD.length;i++){
            for(int j=0; j<twoD[i].length;j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("For each");
      for(int[] inner:twoD){
        for(int num:inner){
                System.out.print(num+" ");
        }
        System.out.println();
      }
    }

}

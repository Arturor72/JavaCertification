public class TestConcat{

    public static void main(String... args){
        String a="ab";
        a+=1;
        a+='c';
        a+=false;
        if("ab1cfalse"==a) System.out.println("==");
        if("ab1cfalse".equals(a)) System.out.println("equals");

    }

}

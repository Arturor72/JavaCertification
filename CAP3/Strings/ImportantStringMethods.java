public class ImportantStringMethods{
    public static void main(String args[]){
        String principal="animals";
        System.out.println("The String is: " + principal);

        lengthTests(principal);

        charAtTests(principal);

        indexOfTests(principal);

        substringTests(principal);

       upperCaseLowerCaseTests(principal);
    }
    private static void lengthTests(String principal){
        printCabeceras("length()");
        System.out.println("The method length(): " + principal.length());
    }

    private static void charAtTests(String principal){
        printCabeceras("charAt()");
        System.out.println("The method charAt(0): " + principal.charAt(0));
        System.out.println("The method charAt(2):" + principal.charAt(2));
        /*  Throws StringIndexOutOfBoundsException
            System.out.println("The method charAt:" + principal.charAt(4));
        */
    }

    private static void indexOfTests(String principal){
        printCabeceras("indexOf()");
        System.out.println("indexOf('a'): "+principal.indexOf('a'));
        System.out.println("indexOf('a',4): "+principal.indexOf('a',4));
        System.out.println("indexOf(\"al\"): "+principal.indexOf("al"));
        //Doesn't throws an exception, indexOf returns -1 when no match found
        System.out.println("indexOf(\"al\",5): "+principal.indexOf("al",5));
    }

    private static void substringTests(String principal){
        printCabeceras("substring()");
        System.out.println("substring(3): "+principal.substring(3));
        System.out.println("substring(principal.indexOf('m')): "+principal.substring(principal.indexOf('m')));
        System.out.println("substring(3,4): "+principal.substring(3,4));
        System.out.println("substring(3,7): "+principal.substring(3,7));

        System.out.println("substring(3,3): "+principal.substring(3,3));//empty string
        /*  Throws StringIndexOutOfBoundsException
            System.out.println("substring(3,2): "+principal.substring(3,2));// throws  StringIndexOutOfBoundsException (out range -1)
            System.out.println("substring(3,8): "+principal.substring(3,8));// throws  StringIndexOutOfBoundsException (out range -1)
        */
    }
    private static void  upperCaseLowerCaseTests(String principal){
        printCabeceras("toUpperCase()");
        System.out.println("toUpperCase(): "+principal.toUpperCase());
        printCabeceras("toLowerCase()");
        System.out.println("toLowerCase(): "+principal.toLowerCase());
    }


    private static void printCabeceras(String methodName){
        System.out.println("------------------------------------");
        System.out.println(methodName + " METHOD");
    }

}

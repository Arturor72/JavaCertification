public class ImportantStringMethods{
    public static void main(String args[]){
        String principal="animals";
        System.out.println("The String is: " + principal);

        lengthTests(principal);

        charAtTests(principal);

        indexOfTests(principal);

        substringTests(principal);

        upperCaseLowerCaseTests(principal);

        equalsTests(principal);

        startsEndsWithTests(principal);

        containsTests(principal);

        replaceTests(principal);

        trimTests(principal);
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
            System.out.println("The method charAt:" + principal.charAt(7));
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
        printCabeceras("toUpperCase() and toLowerCase()");
        System.out.println("principal.toUpperCase(): "+principal.toUpperCase());
        System.out.println("principal.toLowerCase(): "+principal.toLowerCase());
    }

    public static void equalsTests(String principal){
        printCabeceras("equals() and equalsIgnoreCase()");
        System.out.println("\"animals\".equals(principal): "+ ("animals".equals(principal)));
        System.out.println("\"ANIMALS\".equals(principal): "+ ("ANIMALS".equals(principal)));
        System.out.println("\"aNImALs\".equalsIgnoreCase(principal): "+ ("aNImALs".equalsIgnoreCase(principal)));
    }

    public static void startsEndsWithTests(String principal){
        printCabeceras("startsWith() and endsWith()");
        System.out.println("principal.startsWith(\"a\"): "+ principal.startsWith("a"));
        System.out.println("principal.startsWith(\"A\"): "+ principal.startsWith("A"));
        System.out.println("principal.endsWith(\"s\"): "+ principal.endsWith("s"));
        System.out.println("principal.endsWith(\"S\"): "+ principal.endsWith("S"));
        System.out.println("principal.startsWith(\"ani\"): "+ principal.startsWith("ani"));
        System.out.println("principal.endsWith(\"ls\"): "+ principal.endsWith("ls"));
    }

    public static void containsTests(String principal){
        printCabeceras("contains()");
        System.out.println("principal.contains(\"a\"): " + principal.contains("a"));
        System.out.println("principal.contains(\"c\"): " + principal.contains("c"));
        System.out.println("principal.contains(\"ni\"): " + principal.contains("ni"));
    }

    public static void replaceTests(String principal){
        //String replace(char oldChar, char newChar)
        //String replace(CharSequence oldChar, CharSequence newChar)  *CharSequence es una manera general de representar muchas clases (String y StringBuilder)
        printCabeceras("replace()");
        System.out.println("principal.replace('a','A'): " + principal.replace('a','A'));
        System.out.println("principal.replace(\"a\",\"A\"): " + principal.replace("a","A"));
        System.out.println("principal.replace(\"a\",\"A\"): " + principal.replace("a","A"));
        System.out.println("principal.replace(\"nim\",\"OSO\"): " + principal.replace("nim","OSO"));
    }

    public static void trimTests(String principal){
        printCabeceras("trim()");
        System.out.println("principal.trim(): " + principal.trim());
        String nuevoPrincipal="\t    "+principal+"\n";
        System.out.print("nuevoprincipal: "+ nuevoPrincipal);
        System.out.println("nuevoPrincipal.trim(): " + nuevoPrincipal.trim());
    
    }

    private static void printCabeceras(String methodName){
        System.out.println("------------------------------------");
        System.out.println(methodName + " METHOD\n");
    }

}

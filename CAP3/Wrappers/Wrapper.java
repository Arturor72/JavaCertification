//Character no participa de transformaciones parse/valueOf
public class Wrapper{

    public static void main(String[] args){
        createWrappers();     
        
        stringToPrimitive();
        
        stringToWrapperValue();

    }

    public static void stringToPrimitive(){
        boolean booleanPrimitive=Boolean.parseBoolean("true");
        byte bytePrimitive=Byte.parseByte("2");
        short shortPrimitive=Short.parseShort("2");
        int primitive= Integer.parseInt("123");
        long primitiveLong= Long.parseLong("1");
        float floatPrimitive=Float.parseFloat("2.2");
        double doublePrimitive=Double.parseDouble("2.2");
        //NumberFormatException si pasamos un parametro no valido
        //int bad1=Integer.parseInt("a");


    }

    private static void stringToWrapperValue(){
        Boolean wrapperBoolean=Boolean.valueOf("TRUE");
        Byte wrapperByte=Byte.valueOf("2");
        Short wrapperShort=Short.valueOf("2");
        Integer wrapper=Integer.valueOf("123");
        Long  wrapperLong=Long.valueOf("2");
        Float wrapperFloat=Float.valueOf("2.2");
        Double wrapperDouble=Double.valueOf("2.2");
        //NumberFormatException
        //Integer bad2=Integer.valueOf("123.45");
    
    }

    public static void createWrappers(){
        Boolean myboolean=new Boolean(true);
        Byte myByte=new Byte((byte)1);
        Short myShort=new Short((short)1);
        Integer myInteger=new Integer(1);
        Long myLong=new Long(1);
        Float myFloat=new Float(1.0);
        Double myDouble=new Double(1.0);
        Character myCharacter=new Character('c');
    
    }


}

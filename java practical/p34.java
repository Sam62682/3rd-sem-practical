public class p34 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        int intValue = 42;
        Integer integerObject = Integer.valueOf(intValue); 
        System.out.println("Integer Object: " + integerObject);
        int unboxedInt = integerObject.intValue(); 
        System.out.println("Unboxed Integer: " + unboxedInt);
        
        double doubleValue = 3.14;
        Double doubleObject = Double.valueOf(doubleValue); 
        System.out.println("Double Object: " + doubleObject);
        double unboxedDouble = doubleObject.doubleValue(); 
        System.out.println("Unboxed Double: " + unboxedDouble);
        
        char charValue = 'A';
        Character characterObject = Character.valueOf(charValue); 
        System.out.println("Character Object: " + characterObject);
        char unboxedChar = characterObject.charValue(); 
        System.out.println("Unboxed Character: " + unboxedChar);
        
        boolean boolValue = true;
        Boolean booleanObject = Boolean.valueOf(boolValue); 
        System.out.println("Boolean Object: " + booleanObject);
        boolean unboxedBool = booleanObject.booleanValue(); 
        System.out.println("Unboxed Boolean: " + unboxedBool);
        
        long longValue = 123456789L;
        Long longObject = Long.valueOf(longValue); 
        System.out.println("Long Object: " + longObject);
        long unboxedLong = longObject.longValue(); 
        System.out.println("Unboxed Long: " + unboxedLong);
        
        float floatValue = 5.75f;
        Float floatObject = Float.valueOf(floatValue); 
        System.out.println("Float Object: " + floatObject);
        float unboxedFloat = floatObject.floatValue(); 
        System.out.println("Unboxed Float: " + unboxedFloat);
        
        byte byteValue = 10;
        Byte byteObject = Byte.valueOf(byteValue); 
        System.out.println("Byte Object: " + byteObject);
        byte unboxedByte = byteObject.byteValue(); 
        System.out.println("Unboxed Byte: " + unboxedByte);

        short shortValue = 100;
        Short shortObject = Short.valueOf(shortValue); 
        System.out.println("Short Object: " + shortObject);
        short unboxedShort = shortObject.shortValue(); 
        System.out.println("Unboxed Short: " + unboxedShort);
    }
}
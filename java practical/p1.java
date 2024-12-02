public class p1 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
            
        System.out.println("Implicit casting (Winding conversion)\n");
        
        byte bytevar = 65;
        short shortvar = bytevar;
        System.out.println("bytevar : " + bytevar);
        System.out.println("Casting bytevar  to shortvar : " + shortvar + "\n");
        
        shortvar = 66;
        char charvar = (char)shortvar;
        System.out.println("shortvar : " + shortvar);
        System.out.println("Casting shortvar to charvar : " + charvar + "\n");
        
        charvar = 'A';
        int intvar = charvar;
        System.out.println("charvar : " + charvar);
        System.out.println("Casting charvar to intvar : " + intvar + "\n");
        
        intvar = 10;
        float floatvar = intvar;
        System.out.println("intvar : " + intvar);
        System.out.println("Casting intvar to floatvar : " + floatvar + "\n");
        
        floatvar = 10.1f;
        long longvar = (long)floatvar;
        System.out.println("floatvar : " + floatvar);
        System.out.println("Casting floatvar to longvar : " + longvar + "\n");
        
        longvar = 100l;
        double doublevar = longvar;
        System.out.println("longvar : " + longvar);
        System.out.println("Casting longvar to dobulevar : " + doublevar + "\n");
        
        System.out.println("Explicit casting (narrowing conversion)\n");
        doublevar = 5.5;
        longvar = (long)doublevar;
        System.out.println("doublevar : " + doublevar);
        System.out.println("Casting doublevar to longvar : " + longvar + "\n");

        longvar = 100l;
        floatvar = (float)longvar;
        System.out.println("longvar : " + longvar);
        System.out.println("Casting longvar to floatvar : " + floatvar + "\n");

        floatvar = 10.1f;
        intvar = (int)floatvar;
        System.out.println("floatvar : " + floatvar);
        System.out.println("Casting floatvar to intvar : " + intvar + "\n");
        
        intvar = 66;
        charvar = (char)intvar;
        System.out.println("intvar : " + intvar);
        System.out.println("Casting intvar to charvar : " + charvar + "\n");
        
        charvar = 'A';
        shortvar = (short)charvar;
        System.out.println("charvar : " + charvar);
        System.out.println("Casting charvar to shortvar : " + shortvar + "\n");

        shortvar = 66;
        bytevar = (byte)shortvar;
        System.out.println("shortvar : " + shortvar);
        System.out.println("Casting shortvar to bytevar : " + bytevar + "\n");
    }
}
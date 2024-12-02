class methodoverloading{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String a, String b){
        return a + b;
    }
}
public class p12{
    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        methodoverloading mathops = new methodoverloading();
        System.out.println("Sum of 5 and 10 : " + mathops.add(5, 10));
        System.out.println("Sum of 5, 10 and 15 : " + mathops.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5 : " + mathops.add(5.5, 10.5));
        System.out.println("Sum of 'sameer' and 'kurre' : " + mathops.add("sameer", " kurre"));
    }
}
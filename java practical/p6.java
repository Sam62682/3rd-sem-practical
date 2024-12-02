import java.io.Console;
public class p6 {

    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        Console console = System.console();
        String name = console.readLine("Please enter your name : ");
        console.printf("Hello, %s Welcome!\n", name);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p5 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Some Text : ");
        try {
            String userInput = reader.readLine();
            System.out.println("You Entered : " + userInput);
        } catch (IOException e) {
            System.out.println("An error occurred while trying to read input : " + e.getMessage());
        } finally{
            try{
                reader.close();
            }
            catch(IOException e){
                System.out.println("Failed to close the BufferedReader : " + e.getMessage());
            }
        }
    }
}
import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            
            try {
                System.out.print("Enter the denominator: ");
                int denominator = scanner.nextInt();
                
                // Perform division
                int result = numerator / denominator;
                System.out.println("Result: " + result);
                
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Invalid input for denominator. Please enter an integer.");
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input for numerator. Please enter an integer.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
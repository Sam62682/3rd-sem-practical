import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block will always execute
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
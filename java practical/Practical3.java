import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practical3 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        System.out.println("Current date in different formats:");
        System.out.println("Format 1 (dd-MM-yyyy): " + currentDate.format(format1));
        System.out.println("Format 2 (MM/dd/yyyy): " + currentDate.format(format2));
        System.out.println("Format 3 (yyyy/MM/dd): " + currentDate.format(format3));
        System.out.println("Format 4 (EEEE, MMMM dd, yyyy): " + currentDate.format(format4));
    }
}

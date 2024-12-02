import java.util.Scanner;
public class p4 {

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        Scanner sc = new Scanner(System.in);
        int num;
        String name;

        System.out.println("Enter the student roll number : ");
        num = sc.nextInt();

        System.out.println("Enter the student name : ");
        name = sc.next();

        System.out.println("The roll number of student is : " + num + " and name is : " + name);
    }
}




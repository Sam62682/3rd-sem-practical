class student{
    private String name;
    private int age;
    private double grades;
    public student(String name, int age, double grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
    public void displaydetails(){
        System.out.println("Student name : " + name);
        System.out.println("Student age : " + age);
        System.out.println("Student grade : " + grades);
    }
}
public class p11{
    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        student stu1 = new student("Alice", 20,  85.5);
        student stu2 = new student("BoB", 22, 90.0);
        System.out.println("Details of student 1 : ");
        stu1.displaydetails();
        System.out.println("\nDetails of student 2 : ");
        stu2.displaydetails();

    }
}
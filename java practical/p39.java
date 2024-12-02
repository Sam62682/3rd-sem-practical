import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }
}

public class p39 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        Employee employee = new Employee("sameer kurre", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(employee);
            System.out.println("Employee object serialized: " + employee);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Employee object deserialized: " + deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
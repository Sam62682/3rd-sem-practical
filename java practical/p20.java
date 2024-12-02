class OuterClass {
    private String outerField = "Outer field value";

    void outerMethod() {
    
        class LocalClass {
            void display() {
                System.out.println("Accessing: " + outerField);
            }
        }

        LocalClass localClassInstance = new LocalClass();
        localClassInstance.display();
    }
}

public class p20 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
class OuterClass {
    private String outerField = "Outer field value";

    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }

    void createInnerClassInstance() {
    
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class p19 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        OuterClass outer = new OuterClass();
        outer.createInnerClassInstance();
    }
}
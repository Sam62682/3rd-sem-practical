// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
// Driver class
public class p14 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.bark(); 
    }
}
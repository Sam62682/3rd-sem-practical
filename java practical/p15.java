class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String name;

    Dog(String animalName, String dogName) {
        super(animalName); 
        this.name = dogName; 
    }

    void display() {
        super.display(); 
        System.out.println("Dog Name: " + this.name); 
    }
}

public class p15 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Dog dog = new Dog("Generic Animal", "Buddy");
        dog.display();
    }
}
class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return "Some sound";
    }
}

class Mammal extends Animal {
    String furColor;

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public String speak() {
        return "Mammal sound";
    }
}

class Dog extends Mammal {
    String breed;
    
    public Dog(String name, String furColor, String breed) {
        super(name, furColor); 
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}

public class p16 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Dog myDog = new Dog("Buddy", "Brown", "Golden Retriever");

        System.out.println("Name: " + myDog.name);
        System.out.println("Fur Color: " + myDog.furColor);
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Sound: " + myDog.speak());
    }
}
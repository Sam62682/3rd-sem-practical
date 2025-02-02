class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class p17 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();      
        Animal myCat = new Cat();      

        myAnimal.sound();
        myDog.sound();   
        myCat.sound();   
    }
}
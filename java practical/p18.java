interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class p18 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Dog myDog = new Dog();
        myDog.eat();
        myDog.play();
    }
}

import java.util.ArrayList;

public class p49 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        System.out.println("Fruits in the ArrayList: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
} 

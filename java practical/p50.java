import java.util.HashSet;

public class p50 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Banana");

        System.out.println("Fruits in the HashSet: " + fruits);

        if (fruits.contains("Apple")) {
            System.out.println("Apple is present in the HashSet.");
        } else {
            System.out.println("Apple is not present in the HashSet.");
        }

        fruits.remove("Cherry");
        System.out.println("After removing Cherry: " + fruits);

        int size = fruits.size();
        System.out.println("Size of the HashSet: " + size);

        System.out.println("Iterating through the HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
import java.util.HashSet;

public class p35 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Grapes");

        System.out.println("HashSet: " + hashSet);

        if (hashSet.contains("Banana")) {
            System.out.println("HashSet contains Banana");
        } else {
            System.out.println("HashSet does not contain Banana");
        }

        hashSet.remove("Mango");
        System.out.println("HashSet after removing Mango: " + hashSet);

        System.out.println("Size of HashSet: " + hashSet.size());

        System.out.println("Iterating over HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
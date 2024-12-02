import java.util.ArrayList;

public class p36 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        arrayList.add("Grapes");

        System.out.println("ArrayList: " + arrayList);

        String firstElement = arrayList.get(0);
        System.out.println("First element: " + firstElement);

        arrayList.set(2, "Pineapple");
        System.out.println("ArrayList after modifying element at index 2: " + arrayList);

        arrayList.remove("Banana");
        System.out.println("ArrayList after removing Banana: " + arrayList);

        System.out.println("Size of ArrayList: " + arrayList.size());

        if (arrayList.contains("Mango")) {
            System.out.println("ArrayList contains Mango");
        } else {
            System.out.println("ArrayList does not contain Mango");
        }

        System.out.println("Iterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}
import java.util.HashMap;
import java.util.Map;

public class p51 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        HashMap<String, Integer> map = new HashMap<>();

        map.put("sameer", 30);
        map.put("manish", 25);
        map.put("tuleshwar", 35);
        map.put("dhananjay", 28);

        System.out.println("Initial HashMap: " + map);

        String keyToRetrieve = "sameer";
        Integer value = map.get(keyToRetrieve);
        System.out.println("Value associated with key '" + keyToRetrieve + "': " + value);

        String keyToCheck = "tuleshwar";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist in the HashMap.");
        }

        System.out.println("\nIterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        String keyToRemove = "manish";
        map.remove(keyToRemove);
        System.out.println("\nHashMap after removing key '" + keyToRemove + "': " + map);

        System.out.println("Size of the HashMap: " + map.size());

        map.clear();
        System.out.println("HashMap after clearing: " + map);
    }
}
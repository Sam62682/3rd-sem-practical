import java.util.LinkedList;

public class p53 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.addFirst("Mango"); 
        linkedList.addLast("Grapes");  
        
        System.out.println("LinkedList: " + linkedList);

        linkedList.remove("Banana"); 
        linkedList.remove(2);         
        linkedList.removeFirst();     
        linkedList.removeLast();      
        
        System.out.println("After removals: " + linkedList);

        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
                
        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
        
        System.out.println("Does LinkedList contain 'Apple'? " + linkedList.contains("Apple"));
        
        String[] array = linkedList.toArray(new String[0]);
        System.out.println("Array from LinkedList: ");
        for (String s : array) {
            System.out.println(s);
        }

        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
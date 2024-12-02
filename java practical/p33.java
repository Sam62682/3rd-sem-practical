public class p33 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);

        sb.append(", World!");
        System.out.println("After append: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse();
        System.out.println("Reversed back: " + sb);

        sb.replace(5, 10, " Everyone");
        System.out.println("After replace: " + sb);

        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        System.out.println("Length of StringBuffer: " + sb.length());

        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("New capacity after ensuring: " + sb.capacity());

        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
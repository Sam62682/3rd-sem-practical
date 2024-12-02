public class p32 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "hello, world!";

        System.out.println("Original String 1: " + str1);
        System.out.println("Original String 2: " + str2);
        System.out.println("Original String 3: " + str3);

        System.out.println("Length of str1: " + str1.length());

        System.out.println("str1 in uppercase: " + str1.toUpperCase());

        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        System.out.println("str1 equals str3: " + str1.equals(str3));

        System.out.println("str1 equals str3 (ignore case): " + str1.equalsIgnoreCase(str3));

        System.out.println("str2 contains 'Programming': " + str2.contains("Programming"));

        System.out.println("Index of 'W' in str1: " + str1.indexOf('W'));

        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));

        System.out.println("Substring of str2 (from index 5): " + str2.substring(5));

        System.out.println("str1 after replacing 'World' with 'Java': " + str1.replace("World", "Java"));

        String[] words = str1.split(" ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }

        String str4 = "   Hello, Java!   ";
        System.out.println("Trimmed str4: '" + str4.trim() + "'");

        String str5 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str5);
    }
}
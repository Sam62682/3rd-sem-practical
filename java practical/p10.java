import java.util.Arrays;
public class p10 {

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        int[] numbers = {5, 3, 8, 1, 2};
        System.out.println("Original array : " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("Sorted arrays : " + Arrays.toString(numbers));

        int[] numbers2 = {1, 2, 3, 4, 5, 6};

        // check if two arrays are equal
        boolean isEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Are the two arrays equal? " + isEqual);

        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled arrays : " + Arrays.toString(filledArray));

        int[] copiedArray = Arrays.copyOf(numbers, numbers2.length);
        System.out.println("Copied arrays : " + Arrays.toString(copiedArray));

        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of element 3 : " + index);

        String[] stringArray = {"java", "python", "c++"};
        String arrayString = Arrays.toString(stringArray);
        System.out.println("String arrays : " + arrayString);
    }
}
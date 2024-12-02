public class p9 {

    static void printArray(int[] array){
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        printArray(new int[] {1, 2, 3, 4, 5});
        printArray(new int[] {10, 20, 30});
        printArray(new int[] {1000, 2000});
    }
}
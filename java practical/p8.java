public class p8 {

    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        int[][] raggedArray = new int[3][];
        raggedArray[0] = new int[2];
        raggedArray[1] = new int[3];
        raggedArray[2] = new int[4];

        raggedArray[0][0] = 1;
        raggedArray[0][1] = 2;

        raggedArray[1][0] = 1;
        raggedArray[1][1] = 2;
        raggedArray[1][2] = 3;

        raggedArray[2][0] = 1;
        raggedArray[2][1] = 2;
        raggedArray[2][2] = 3;
        raggedArray[2][3] = 4;

        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) { // Fix here
                System.out.print(raggedArray[i][j] + " "); // Change to print for better formatting
            }
            System.out.println();
        }
    }
}
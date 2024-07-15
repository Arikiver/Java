public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        // Access elements
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println("value at (1,2) is "+myNumbers[1][2]); // Outputs 7

        //Change Element Values
        myNumbers[1][2] = 9;
        System.out.println("value at (1,2) changed from 7 to "+myNumbers[1][2]); // Outputs 9 instead of 7

        //Loop Through a Multi-Dimensional Array
        System.out.println("itterating through the whole array:");
        for (int i = 0; i < myNumbers.length; ++i) {
            System.out.print("{");
            for (int j = 0; j < myNumbers[i].length; ++j) {
              System.out.print(myNumbers[i][j]+", ");
            }
            System.out.print("}");
            System.out.println();
          }
    }
}

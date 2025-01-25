import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10];

        // Taking input from the user
        System.out.println("Enter 100 elements for the 10x10 array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Enter value for position [%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Displaying the array using a for-each loop
        System.out.println("\nThe values you entered are:");
        int row = 0;
        for (int[] rowArray : array) {
            int col = 0;
            for (int value : rowArray) {
                System.out.printf("Value at [%d][%d]: %d\n", row, col, value);
                col++;
            }
            row++;
        }

        scanner.close();
    }
}

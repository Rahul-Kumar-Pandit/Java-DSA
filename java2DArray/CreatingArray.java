package java2DArray;

import java.util.Scanner;

public class CreatingArray {
    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Element is found at [" + i + "," + j + "]");
                    return true;
                }
            }
        }
        System.out.println("Element is not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in 2-D array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrix[i][j]) + " ");
            }
            System.out.println();
        }
        Search(matrix, 5);
        sc.close();
    }
}

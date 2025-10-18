package java2DArray;

import java.util.Scanner;

public class Largest {
    public static void largestAndSmallest(int arr[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(largest<arr[i][j]){
                    largest = arr[i][j];
                }
                if(smallest>arr[i][j]){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("The Largest element is : "+largest);
        System.out.println("The Smallest element is : "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        largestAndSmallest(arr);
        sc.close();
    }
}
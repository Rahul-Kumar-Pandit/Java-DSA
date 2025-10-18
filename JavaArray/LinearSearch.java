package JavaArray;

import java.util.Scanner;

public class LinearSearch {
    public static int LSearch(int a[],int key){
        for(int i=0; i<a.length; i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the element in array ");
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to find in the list : ");
        int key = sc.nextInt();
        System.out.println("The Index of "+key + " is "+LSearch(a, key));
        sc.close();
    }
}

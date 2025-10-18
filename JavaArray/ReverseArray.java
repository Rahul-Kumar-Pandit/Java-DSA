package JavaArray;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int a[]){
        int start = 0,end = a.length-1;
        while(start<end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements in array : ");
        for(int i=0; i<a.length; i++){
            a[i] =  sc.nextInt();
        }
        reverseArray(a);
        System.out.println("Here The Reverse Array : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"  ");
        }
        sc.close();
    }
}
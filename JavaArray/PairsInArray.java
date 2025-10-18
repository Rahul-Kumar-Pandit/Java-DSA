package JavaArray;

import java.util.Scanner;

public class PairsInArray {
    public static void pairsArray(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                System.out.print("("+a[i]+","+a[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the element in an array ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        pairsArray(a);
        sc.close();
    }
}

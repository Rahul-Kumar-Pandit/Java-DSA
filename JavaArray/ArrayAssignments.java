package JavaArray;

import java.util.Scanner;

// Q1.
/*
 public class ArrayAssignments {
    public static boolean SamePair(int a[]){
        for(int i=0; i<a.length; i++){
            int l = a[i];
            for(int j=i+1; j<a.length; j++){
                if(l==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {1,2,2,2};
        System.out.println(SamePair(a));
    }
}
 */
// Q2.

public class ArrayAssignments{
    public static void Rotation(int a[],int index){
        for(int i = index; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        for(int j=0; j<index; j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }
    public static int ReturnValueIndex(int a[],int target){
        for(int i=0; i<a.length; i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int a[] = {0,1,2,4,5,6,7};
        // Rotation(a, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Indext from which position you to rotate your elements : ");
        int index = sc.nextInt();
        Rotation(a, index);
        System.out.print("Enter the Target : ");
        int target = sc.nextInt();
        
        System.out.println("Target = "+ReturnValueIndex(a, target));
        sc.close();
    }
}


// Question 3


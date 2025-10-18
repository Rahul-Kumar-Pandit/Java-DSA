package JavaArray;

import java.util.Scanner;

public class Array {
    /* public static void update(int marks[] ){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 3;
        }
    } */

    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest =  Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(Largest<numbers[i]){
                Largest = numbers[i];
            }
            if(Smallest>numbers[i]){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value is : "+Smallest);
        return Largest;
    }
    public static void main(String[] args) {
        // int [] marks = new int[5];
        int numbers[] = {1,3,7,4,9,2};
        Scanner sc = new Scanner(System.in);
        // For compile time initialization :-

        /* marks[0] = 94;
        marks[1] = 97;
        marks[2] = 87;
        System.out.println("Math = "+marks[0]);
        System.out.println("Physic = "+marks[1]);
        System.out.println("Chemistry = "+marks[2]); */

        // for Run time initialization
        /* for(int i=0; i<3; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){
            System.out.print(marks[i]+"\t");
        }
        System.out.println(); */

        // Passing Array as an Argument 

        /* for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + "\t");
        }
        System.out.println(); */


        // Print the Largest and Smallest Value in the array

        System.out.println("Largest value is : "+getLargest(numbers));
        sc.close();
    }
}

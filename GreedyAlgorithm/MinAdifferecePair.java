package GreedyAlgorithm;
import java.util.*;
public class MinAdifferecePair {
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        // Sort
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("Sum of difference of all the minimum pairs = "+minDiff);
    }
}
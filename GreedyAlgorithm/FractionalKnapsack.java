package GreedyAlgorithm;

import java.util.*;

// Question :- 
// -------------- Fractional Knapsack ------------
public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) (weight[i]);
        }

        // ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int vackent = W;
        int total=0;
        for(int i = ratio.length-1; i>=0; i--){
            int idx = (int) ratio[i][0];
            if(vackent>=weight[idx]){
                total += value[idx];
                vackent -= weight[idx];
            }else{
                total += (ratio[i][1] * vackent);
                vackent = 0;
                break;
            }
        }
        System.out.println(total);
    }
}

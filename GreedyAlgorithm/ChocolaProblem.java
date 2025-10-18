package GreedyAlgorithm;

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        // int n=3,m=6;
        Integer costVer[] = {2,1,3,1,4};    //m-1
        Integer costHor[] = {4,1,2};        // n-1
        // Sort in descending order
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0;    // Pointer to track my array
        int hp=1,vp=1;  // How many cuts in my chocolate
        int cost = 0;   // How much cost we have
        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){   // horizontal cut
                cost += (costHor[h] * vp);
                h++;
                hp++;
            }else{
                cost += (costVer[v] * hp);
                v++;
                vp++;
            }
        }

        // Horizontal cur
        while(h<costHor.length){
            cost += (costHor[h] * vp);
            h++;
            hp++;
        }

        // Vertical cut
        while(v<costVer.length){
            cost += (costVer[v] * hp);
            v++;
            vp++;
        }

        System.out.println("minimum cost to cut chocolate = "+cost);
    }
}
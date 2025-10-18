package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;


public class ChainOfPair {
    public static void main(String[] args) {
        int pair[][] = {
                        {5,24},
                        {39,60},
                        {5,28},
                        {27,40},
                        {50,90}
                        };
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int chainlen = 1;
        int chainEnd = pair[0][1];   // last selected pair end

        for(int i=0; i<pair.length; i++){
            if(pair[i][0] > chainEnd){
                chainlen++;
                chainEnd = pair[i][1];
            }
        }
        System.out.println("Chain length is : "+chainlen);
    }
}

package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IndianCoin {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Integer coin[] = {1,2,5,10,20,50,100,200,500,2000};

        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount : ");
        int amount = sc.nextInt();

        Arrays.sort(coin,Comparator.reverseOrder());

        for(int i=0; i<coin.length; i++){
            if(coin[i]<=amount){
                while(coin[i]<=amount){
                    count++;
                    arr.add(coin[i]);
                    amount = amount - coin[i];
                }
            }
        }
        System.out.println("Number of coins : "+count);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}

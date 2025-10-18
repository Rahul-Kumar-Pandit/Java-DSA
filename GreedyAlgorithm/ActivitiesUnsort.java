package GreedyAlgorithm;

import java.util.*;

// Here end time doesn't in sorted order
public class ActivitiesUnsort {
    public static void main(String[] args) {
        int start[] = {15,12,20};
        int end[] =   {20,25,30};
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Sort end 
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // lambda function -> sortform 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=0; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities = "+maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}

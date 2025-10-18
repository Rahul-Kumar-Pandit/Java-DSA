package LeetCode;

import java.util.Arrays;

public class LeetCode881 {
    public static int numRescueBoats(int arr[],int limit){
        Arrays.sort(arr);
        int si = 0;
        int ei=arr.length-1;
        int result = 0;
        while(si<=ei){
            if(arr[si]+arr[ei] <= limit){
                si++;
            }
            ei--;
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int limit = 3;
        int minBoatUses = numRescueBoats(arr, limit);
        System.out.println(minBoatUses);
    }
}

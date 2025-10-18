package LeetCode;

import java.util.HashSet;

public class LeetCode2554 {
    public static int maxCount(int[] banned, int n, int maxSum) {
        if(maxSum==1)return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<banned.length; i++){
            set.add(banned[i]);
        }
        int count = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                sum += i;
                if(sum>maxSum){
                    break;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6};
        int n = 5;
        int maxSum = 6;
        System.out.println(maxCount(arr, n, maxSum));
    }
}
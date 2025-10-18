package Hashing.HashSet;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void removeDuplicates(int nums[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,2};
        removeDuplicates(arr);
    }
}

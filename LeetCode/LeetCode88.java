package LeetCode;

public class LeetCode88 {
    public static void merge(int nums1[],int nums2[]){
        int result[] = new int[nums1.length + nums2.length];
        int k=0;
        int si = 0;
        int ri = 0;
        while(si<nums1.length && ri < nums2.length){
            if(nums1[si]<nums2[ri]){
                result[k++] = nums1[si++];
            }else{
                result[k++] = nums2[ri++];
            }
        }

        while(si<nums1.length){
            result[k++] = nums1[si++];
        }

        while(ri<nums2.length){
            result[k++] = nums2[ri++];
        }
        printArray(result);
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+' ');
        }
    }
    public static void main(String[] args) {
        int ar1[] = {1,2,3};
        int arr2[] = {1,3,4,5,6};
        merge(ar1, arr2);
        // printArray(arr2);
    }    
}
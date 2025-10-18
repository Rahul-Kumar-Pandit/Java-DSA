// Problem is : Search in rotated Sorted Array 

public class DivideAndConquer {
    public static int Search(int arr[],int targer,int si,int ei){
        if(si > ei){
            return -1;
        }
        // Kaam
        int mid = si + (ei-si)/2;

        // Case Found
        if(arr[mid]==targer){
            return mid;
        }

        // Mid on L1
        if(arr[si] <= arr[mid]){
            // case a : L1 for left 
            if(arr[si] <= targer && targer <= arr[mid]){
                return Search(arr, targer, si, mid-1);
            }else{
                // case b 
                return Search(arr, targer, mid+1, ei);
            }
        }

        // Mid on L2
        else{
            // case c :  L2 right 
            if(arr[mid] <= targer && targer <= arr[ei]){
                return Search(arr, targer, mid+1, ei);
            }else{
                return Search(arr, targer, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int targer = 0;
        int tarIdx = Search(arr, targer, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}

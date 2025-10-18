package JavaArray;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int number[],int key){
        int start = 0,end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if an array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the elements in array ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the item which you want to find in the list : ");
        int key = sc.nextInt();        
        System.out.println("indext of the item "+key+" is : "+binarySearch(numbers, key));       
        sc.close();
    }
}

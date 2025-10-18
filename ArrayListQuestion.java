import java.util.ArrayList;
 /*     Question :- Pair sum - 1
        Find if any pair in a sorted Arraylist has a targer sum 
 */
/* 
public class ArrayListQuestion {
    public static boolean pairTargetSum(ArrayList<Integer> list,int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       
        System.out.println(pairTargetSum(list, 5));
    }
}
 */



 /*     Question :- Pair sum - 1
        2 pointer Approach 
        Find if any pair in a sorted Arraylist has a targer sum 
 */
/* public class ArrayListQuestion {
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }else if((list.get(lp)+list.get(rp))>target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum1(list, 12));
    }    
}
 */

/*      Question :- Pair sum - 2
        Find if any pair in a sorted and rotated Arraylist has a target sum
        list - [11,15,6,7,8,9,10]
 */

public class ArrayListQuestion {
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        // UnderStand the logic from note book.......................
        int bp = -1;        // bp --> breaking point
        int n = list.size();
        for(int i=0; i<n-1; i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
            }
        }

        int lp = bp+1;      // lp --> left pointer
        int rp = bp;        // rp --> right pointer
        while (lp!=rp) {
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)>target){
                rp = (n+rp-1)%n;     // Here is nothing but (rp--)
            }else{
                lp = (lp+1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 16));
    }    
}
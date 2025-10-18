import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // // Creat a single list 1 
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1); 
        // list1.add(2);
        // list1.add(3);
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(4);
        // list2.add(5);
        // list2.add(6);
        // list2.add(7);
        // mainList.add(list2);

        // // for print the element of list1 and list2
        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);


        // Question of multi - ArrayList
        // print 
        // 1 2 3 4 5
        // 2 4 6 8 10
        // 3 6 9 12 15
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println();
        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        System.out.println();
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
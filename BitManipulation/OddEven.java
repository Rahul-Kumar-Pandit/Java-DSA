package BitManipulation;

public class OddEven {
    public static void oddEven(int num){
        int bitmask = 1;
        if((num & bitmask)==0){
            // Even condition
            System.out.println("Even number ");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(4);
        // oddEven(19);
        // oddEven(12);
        // oddEven(1);
    }
}
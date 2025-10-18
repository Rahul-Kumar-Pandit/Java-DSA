package BitManipulation;

public class UppertoLower {
    public static void main(String[] args) {
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print((char)(ch | ' ')+" ");
            // A -> 65, ' ' -> 32 ==> a -> 97
        }
    }
}

package BitManipulation;

public class Swaping {
    public static void main(String[] args) {
        
        int x=10;
        int y = 20;
        System.out.println("Before Swaping "+"x"+" = "+x);
        System.out.println("Before Swaping "+"y"+" = "+y);

        x = x^y;
        y = y^x;
        x = x^y;

        System.out.println("After Swaping "+" x "+" = "+x);
        System.out.println("After Swaping "+" y "+" = "+y);
    }
    
}

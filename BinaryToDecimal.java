/* 
        ******* Binary To Decimal ****************
 */

/* import java.util.Scanner;

public class BinaryToDecimal {
    public static void biToDec(int biNum){
        int myNum = biNum;
        int pow = 0;
        int decimal = 0;
        while(biNum>0){
            int lastDigit = biNum%10;
            decimal = decimal + (lastDigit*(int)Math.pow(2,pow));
            biNum = biNum/10;
            pow++;
        }
        System.out.println("Decimal of "+myNum +" = "+decimal);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number : ");
        int binum = sc.nextInt();
        biToDec(binum);
        sc.close();
    }
}
 

/* 

        ******* Decimal To Binary *************

 */

import java.util.Scanner;

public class BinaryToDecimal{
    public static void DecToBin(int num){
        int myNum = num;
        int pow = 0;
        int biNum = 0; 
        while(num>0){
            int rem = num%2;
            biNum = biNum + (rem * (int)Math.pow(10,pow));
            pow++;
            num = num/2;
        }
        System.out.println("Binary of "+myNum+" = "+biNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int num = sc.nextInt();
        DecToBin(num);
        sc.close();
    }
}
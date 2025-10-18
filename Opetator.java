import java.util.Scanner;

public class Opetator {
    public static void main(String[] args){
        // ************ Arithmetic Operator ***************
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is : "+ sum);
        int difference = a-b;
        System.out.println("Difference is : "+ difference);
        System.out.println("Multiplication is : " + (a*b));
        System.out.println("Division is : "+(a/b));
        System.out.println("Modulo is : "+ (a%b));

            // ************ Relational Operator ***************
        System.out.println("A is greater than B : "+ (a>b));
        System.out.println("A is less than B : "+ (a<b));
        System.out.println("A is equal to B : "+(a==b));
        System.out.println("A is not equal to B : "+(a!=b));
        System.out.println("A is greater than equal to B : "+(a>=b));
        System.out.println("A is less than equal to B : "+ (a<=b));


        // ************ logical Operator ***************
        System.out.println((3>1) && (5>3));
        // System.out.println((3>1) || (5<0));
        System.out.println((!(5>2)));

        // ************ Assignment Operator ***************
        System.out.println(a+=2);
        System.out.println(b-=3);
        System.out.println(b*=4);
        sc.close();
    }
}

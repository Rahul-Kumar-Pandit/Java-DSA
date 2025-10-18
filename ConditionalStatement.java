import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int tax;
        if(salary<=500000){
            tax = 0;
        }
        else if(salary>500000 && salary<=1000000){
            tax = (int)(salary * 0.2);
        }
        else
        {
            tax = (int) (salary*0.3);
        }
        System.out.println("Your tax is : "+tax);

        // leap year
        System.out.println("Enter year");
        int year = sc.nextInt();
        if(year%4==0 || year%400==0 ||year%100 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Wrong operator ");
        } 
        sc.close();
    }
}

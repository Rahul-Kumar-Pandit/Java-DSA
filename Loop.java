import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }
        // System.out.println();
        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println();
        // int count =1;
        // do{
        //     System.out.println(count);
        //     count++;
        // }while(count<=10);

        // prime or not

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int x=2; x<=number-1; x++){  
            if(number%x==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
        sc.close();
    }
}
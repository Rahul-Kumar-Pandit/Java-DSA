// find the value of Binomial Coefficient nCr = n!/r!(n-r)! 

/* public class Function {
    public static int Factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
    public static int BinomialCoefficient(int n,int r){
        int Fact_N = Factorial(n);
        int Fact_R = Factorial(r);
        int Fact_NMR = Factorial(n-r);
        int Binomial = Fact_N/(Fact_R*(Fact_NMR));
        return Binomial;
    }
    public static void main(String[] args){
        int num = 5;
        int r = 3;
        int Fact = Factorial(num);
        int fact = Factorial(r);
        System.out.println("Factorial of "+num +" is "+Fact);
        int BCoeff = BinomialCoefficient(num, r);
        System.out.println("Factorial of "+r +" is "+fact);
        System.out.println("The Value of Binomial Coefficient is "+BCoeff);
    }
}
 */

// Check if a number is prime or not (prime otimized)


// Print prime number in the range like (2 to n)


/* import java.util.Scanner;

public class Function{
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeNumber(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        PrimeNumber(num);
        sc.close();
    }
}
 */



// PRACTICE QUESTION FOR FUNCTION IN JAVA

public class Function{
    // Average of three numbers

    /* public static void Average(int a,int b, int c){
        float avg = (a+b+c)/3.0f;
        System.out.println("Average of three number is : "+ avg);
    } */
    // public static void main(String args[]){
    // Average(87, 93, 89);
    // }

    // Check if a number is even of not 

    // public static boolean isEven(int num){
    //     if(num%2==0){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String args[]){
    //     System.out.println(isEven(8));
    // }

    // Check if a number is Palindrome or not

    public static boolean isPalindrome(int num){
        int sum = 0;
        int myNum = num;
        while(num>0){
            int rem = num%10;
            sum = sum*10 + rem;
            num = num/10;
        }
        if(myNum==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(122));
    }
}

// **********  Overloading ********************
/* 
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        // Java understand it is in double so we have to typecast datatype
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,4));

    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
*/

// ***************** Overriding ********************

// public class Polymorphism{
//     public static void main(String[] args) {
//         Deer d1 = new Deer();
//         d1.eat();
//         Horse a1 = new Horse();
//         a1.eat();
//     }
// }

// class Horse{
//     void eat(){
//         System.out.println("Eat anything");
//     }
// }
// class Deer extends Horse{
//     void eat(){
//         System.out.println("Eat Grass");
//     }
// }

public class Polymorphism {

    public static void main(String[] args) {
        Base b = new Base();
        b.print();

        Child c = new Child();
        c.print();

    }
}
class Base{
    public void print(){
        System.out.println("Base Class Function");
    }
}
class Child extends Base{
    public void print(){
        System.out.println("Derived class Function ");
    }
}
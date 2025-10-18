/* 
***********  MultiLevel Inheritance *************
 */
/* 
public class InheritanceType {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
*/

/* 
***********  Hierarchial Inheritance *************
*/

/* public class InheritanceType{
    public static void main(String[] args) {
        Mammal tiger = new Mammal();
        tiger.eat();
        tiger.walk();

        Bird peason = new Bird();
        peason.eat();
        peason.fly();

        Fish dragon = new Fish();
        dragon.eat();
        dragon.breathe();
        dragon.swim();
    }
}

class Animal{
     String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim in water");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly in sky");
    }
} */

/* 
******************* Hybrid Inheritance ****************
 */

/* public class InheritanceType{
    public static void main(String[] args) {
        Fish f = new Fish();
        f.Swim();
    }
}

class Animal{
     String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Fish extends Animal{
    void Swim(){
        System.out.println("Swim in water");
    }
}
class Shark extends Fish{
    void Bones(){
        System.out.println("Shark don't have bones");
    }
}
class Whale extends Fish{
    
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Cat extends Mammal{

}
class Dog extends Mammal{

}
class Tiger extends Mammal{

}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly in sky");
    }
}
class Peacock extends Bird{

}

 */
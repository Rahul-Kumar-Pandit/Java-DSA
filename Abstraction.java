public class Abstraction {
    public static void main(String[] args) {
        // Horse h1 = new Horse();
        // h1.Eat();
        // h1.walk();
        // Chicken c = new Chicken();
        // c.Eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        myHorse.Eat();
    }
}

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor called...");
    }
    void Eat() {
        System.out.println("Animals eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse Constructor called...");
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called...");
    }
}
class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }

}

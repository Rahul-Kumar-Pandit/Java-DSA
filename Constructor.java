public class Constructor {
    public static void main(String[] args) {
        Employee raj = new Employee("Raj");
        System.out.println(raj.name);
        
        Employee rahul = new Employee();
        rahul.name = "Rahul";
        System.out.println(rahul.name);
        Employee satish = new Employee(10000);
        System.out.println(satish.salary);
    }
}

class Employee{
    String name;
    int salary;
    // Default Constructor
    Employee(){
        System.out.println("Constructor is called.");
    }

    // Parameterized Constructor
    Employee(String name){
        this.name = name;
    }

    Employee(int salary){
        this.salary = salary;
    }
}


public class SetterGetter {
     public static void main(String[] args) {
        Student s1 = new Student();
        s1.SetName("Rahul");
        System.out.println(s1.GetName());
        s1.SetRollNo(93);
        System.out.println(s1.GetRollNO());
    }
}  

class Student{
    private String name;
    private int rollNo;

    // Getters
    String GetName(){
        return this.name;
    }
    int GetRollNO(){
        return this.rollNo;
    }

    // Setters
    void SetName(String name){
        this.name = name;
    }
    void SetRollNo(int rollNo){
        this.rollNo = rollNo;
    }
}
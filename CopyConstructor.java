/* public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shardha";
        s1.rollNo = 93;
        s1.marks[0] = 100;
        s1.marks[1] = 96;
        s1.marks[2] = 92;
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println();
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollNo;
    int marks[];
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called..");
    }

    // Shallow Copy constructor

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor


    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
 */
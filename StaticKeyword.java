public class StaticKeyword{
    
    public static void main(String[] args) {
        // xyz x1 = new xyz();
        // x1.schoolName = "SVIET";
        // xyz x2 = new xyz();
        // System.out.println(x2.schoolName);
    }
}
class xyz{
    String name;
    int rollNo; 
    static String schoolName;
    void SetName(String name){
        this.name = name;
    }
    String GetName(){
        return this.name;
    }
}


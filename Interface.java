public class Interface {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        Bear B1 = new Bear();
        B1.coocked();
        B1.food();
    }
}

interface ChessPlayer{
    void moves(); // It is in public bydefault
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left and diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left and diagonal (by 1 step)");
    }
}


/* 
 * ********************** Multiple Inheritance ******************
 */
interface Harbivore {
    void food();
}
interface Carnivore{
    void coocked();
}
class Bear implements Harbivore,Carnivore{
    public void food(){
        System.out.println("Bear eats grass");
    }
    public void coocked(){
        System.out.println("Bear eats meat as well");
    }
}
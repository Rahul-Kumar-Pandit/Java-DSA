package Queue;

import java.util.Deque;
import java.util.LinkedList;

/* 
    Question 7 :-
 -------------- Stack & Queue using Deque ---------
 */
public class StackDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        // push()
        public void push(int data){
            deque.addLast(data);
        }

        // pop()
        public int pop(){
            return deque.removeLast();
        }

        // peek()
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        // Deque<Integer> deque = new LinkedList<>();
        // // Add proccess in stack using Deque (push())
        // deque.addLast(1);
        // deque.addLast(2);
        // deque.addLast(3);
        // // Remove element from the stack (pop())
        // while(!deque.isEmpty()){
        //     System.out.println(deque.removeLast());
        // }

        // // peek()
        // System.out.println(deque.getLast());


        // Using Method
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}


/* 
    Question 2 :-
  -------------------- Queue using two stack ---------
 */

package Queue;

import java.util.Stack;

public class QueueTwoStack {
    public static class Queue{
       static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // add
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                  s1.push(s2.pop());                
            }
        }

        // remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = s1.peek();
            s1.pop();
            return val;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
/* public class QueueB {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty
        public static boolean isEmpty() {
            return (rear == -1);
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full ");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            // Element Shifting
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek()
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
 */


/* 
 ----------- Circular Queue using Array ---------------
 */

public class QueueB {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return (rear == -1);
        }

        // isFull
        public boolean isFull(){
            return (rear+1)%size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full ");
                return;
            }
            // add first time
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        // remove
        public  int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }

            return result;
        }

        // peek()
        public  int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}



/* 
 --------------- Queue using Linked List ----------
 */
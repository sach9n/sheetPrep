package Queue;

public class implementQueue {

    // implementation using Array
    // circular Queue
     // Adding the value the queue called Enqueue
     static int capacity = 5;
     static  int queueSize = 0;
    static int[]arr = new int[capacity];
   static int front = 0, rear = -1; // because  the queue is added and removed at the front FIFO
    public static void  Enqueue(int val) {
         if(queueSize== capacity){
             System.out.println("The Queue is Filled");
         }else {
             rear = (rear + 1)% capacity; // to avoid index out of bond
             arr[rear] = val;
             queueSize++;
         }
     }

     static  int Dequeue(){
        if(queueSize==0){
            System.out.println("The Queue is Empty so not Possible");
            return -1;
        } else {
            int value = arr[front];
            front = (front +1)% capacity; // avoid getting the index out of bond
            queueSize--;
            return value;
        }


     }

    static int front(){
        if(queueSize==0){
            System.out.println("Queue is Empty");
             return -1;
        } else {
            return  arr[front];
        }
     }

   static int rear(){
        if(queueSize==0){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return  arr[rear];
        }
    }

    public static void main(String[] args) {
        Enqueue(10);
        Enqueue(20);
        Enqueue(30);


        System.out.println(front());
        System.out.println(rear());
        System.out.println(Dequeue());
    }

}

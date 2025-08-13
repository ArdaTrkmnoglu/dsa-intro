package dsa_intro.DSA_files;
import java.util.Queue;         // Queue: First-in First-out
import java.util.LinkedList;

public class queues {

    public static void main(String[] args) {

        /* --- Queues --- */

        /**
         * First-In First-Out
         * 
         * enqueue  ->  offer()
         * dequeue  ->  poll()
         */

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Arda");    // enqueue with  offer()  method (on the tail)
        queue.offer("Ayda");
        queue.offer("Metehan");
        queue.offer("Azra");
        queue.offer("Fatih");

        queue.poll();             // poll()  method dequeues the head of the queue ("Arda")

        System.out.println(queue);

        boolean empty = queue.isEmpty();
        System.out.println(empty);

    }
    
}

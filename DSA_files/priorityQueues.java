package dsa_intro.DSA_files;
import java.util.Queue;         // Queue: First-in First-out
import java.util.PriorityQueue;

public class priorityQueues {
    public static void main(String[] args) {
        
        Queue<Double> gpaQueue = new PriorityQueue<>();

        gpaQueue.offer(3.69);
        gpaQueue.offer(3.10);
        gpaQueue.offer(2.91);
        gpaQueue.offer(3.82);
        gpaQueue.offer(2.40);
        gpaQueue.offer(4.00);

        while (!gpaQueue.isEmpty()) {
            System.out.println(gpaQueue.poll());
        }

    }
    
}

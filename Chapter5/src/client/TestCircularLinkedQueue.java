package client;

import adt.CircularLinkedQueue;
import adt.QueueInterface;

public class TestCircularLinkedQueue {

    public static void main(String[] args) {
        QueueInterface<Integer> queue = new CircularLinkedQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Test Get Front
        System.out.println("Get Front: " + queue.getFront());
        System.out.println("queue elements: " + queue);

        // Test GetFront When queue is empty
        System.out.println("\nDequeue an element: " + queue.dequeue());
        System.out.println("queue elements: " + queue);

        System.out.println("\nDequeue an element: " + queue.dequeue());
        System.out.println("queue elements: " + queue);

        System.out.println("\nDequeue an element: " + queue.dequeue());
        System.out.println("queue elements: " + queue);

        System.out.println("\nDequeue an element: " + queue.dequeue());
        System.out.println("queue elements: " + queue);

        System.out.println("Get Front: " + queue.getFront());

        System.out.println("queue elements: " + queue);
        System.out.println("\nqueue is empty " + queue.isEmpty());

    }
}

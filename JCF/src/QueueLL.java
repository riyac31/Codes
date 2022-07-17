import java.util.*;
public class QueueLL {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //to add new elements in the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(10);
        queue.offer(93);
        queue.offer(34);
        System.out.println(queue);

        //to remove the top element of the queue
        System.out.println(queue.poll());
        System.out.println(queue);

        //to display the next element to be removed from the queue
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}

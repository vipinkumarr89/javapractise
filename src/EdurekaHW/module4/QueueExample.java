package EdurekaHW.module4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i=0; i<5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue-"+q);

        // To remove the head of queue.
        int removeelement = q.remove();
        System.out.println("removed element-" + removeelement);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        int size = q.size();
        System.out.println("Size of queue-" + size);

        // to add element in the queue we use add()
        int var1 = 10;
        q.add(var1);
        System.out.println("New Element Added in the Queue");
        System.out.println("New Queue looks like below ");
        for(int i : q){
            System.out.println(i);
        }

        //use element to see the first element like peek but
        // throws exception when queue is empty

        // poll is like remove and return null if queue is empty
    }
}

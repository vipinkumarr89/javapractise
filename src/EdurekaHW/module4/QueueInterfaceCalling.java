package EdurekaHW.module4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceCalling implements QueueInterface {
    @Override
    public void insert(int var1) {
    }

    @Override
    public void delete(int var2) {
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i = 0; i < 5; i++)
            q.add(i);
        // Display contents of the queue.
        System.out.println("Elements of queue-" + q);
        // To remove the head of queue.
        int removeelement = q.remove();
        System.out.println("removed element-" + removeelement);
        System.out.println(q);
    }
}

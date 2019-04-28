package EdurekaHW.module4;

import java.util.LinkedList;
import java.util.Queue;

public class CallingQueueInterface2 extends CallingQueueInterface {


    public static void main(String[] args) {
//        QueueInterface queue=new CallingQueueInterface();
        QueueInterface queue=new CallingQueueInterface2();
//        CallingQueueInterface queue=new CallingQueueInterface();
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.delete(12);
    }
}

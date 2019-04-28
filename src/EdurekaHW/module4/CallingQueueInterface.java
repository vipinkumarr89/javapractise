package EdurekaHW.module4;

import java.util.LinkedList;
import java.util.Queue;

public class CallingQueueInterface implements QueueInterface {

        Queue<Integer> q = new LinkedList<>();

        @Override
        public void insert( int var1){
            System.out.println("Added item in Queue is " + var1);
            q.add(var1);
            for(int i : q){
                System.out.println("item in Queue "+i);
            }
        }

        @Override
        public void delete( int var2){
            System.out.println("removed item is " + q.remove());
            for(int i : q){
                System.out.println("item in Queue "+i);
            }
        }

    public static void main(String[] args) {
//        QueueInterface queue=new CallingQueueInterface();
        CallingQueueInterface queue=new CallingQueueInterface();
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.delete(12);
    }
}

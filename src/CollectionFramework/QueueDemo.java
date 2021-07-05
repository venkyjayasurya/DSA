package CollectionFramework;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=10; i>0; i--){
            queue.add(i);
        }
        System.out.println(queue);

//        Priority Queue sorts the data automatically in ascending order
//        Peeking = Obtaining the head of the queue
//        Polling = Remove the end of the queue
        System.out.println("Queue Size is :" + queue.size());
        System.out.println("Head of the queue is:" + queue.peek());
        queue.poll();
        System.out.println("Queue Size After poll is :" + queue.size());
        System.out.println("Head of the queue is:" + queue.peek());

    }
}

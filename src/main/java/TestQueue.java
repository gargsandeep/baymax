import queue.ImmutableQueue;
import queue.ImmutableQueueUsingLinkList;

public class TestQueue {

    public static void main(String[] args) {
        ImmutableQueue<Integer> immutableQueue = new ImmutableQueueUsingLinkList<Integer>();
        ImmutableQueue newQueue = immutableQueue.enQueue(1);
        ImmutableQueue newQueue1 = newQueue.enQueue(2);
        ImmutableQueue newQueue2 = newQueue1.deQueue();
        System.out.println(immutableQueue + "   "+ newQueue+"  "+newQueue1+" "+newQueue2);

    }
}

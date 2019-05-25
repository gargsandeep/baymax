package queue;
import java.util.LinkedList;
import java.util.Queue;

public class ImmutableQueueUsingLinkList<T> implements ImmutableQueue<T>{

    private Queue<T> internalQueue;

    public ImmutableQueueUsingLinkList(){
        internalQueue = new LinkedList<T>();
    }

    public ImmutableQueue<T> enQueue(T object) {
        ImmutableQueue<T> newQ = getCopiedImmutableQueue();
        ((ImmutableQueueUsingLinkList<T>) newQ).internalQueue.offer(object);
        return newQ;
    }

    public ImmutableQueue<T> deQueue() {
        ImmutableQueue<T> newQ = getCopiedImmutableQueue();
        ((ImmutableQueueUsingLinkList<T>) newQ).internalQueue.poll();
        return newQ;
    }

    private ImmutableQueue<T> getCopiedImmutableQueue() {
        ImmutableQueue<T> newQ = new ImmutableQueueUsingLinkList<T>();
        ((ImmutableQueueUsingLinkList<T>) newQ).internalQueue.addAll(internalQueue);
        return newQ;
    }

    public T head() {
        return internalQueue.peek();
    }

    public boolean isEmpty() {
        return internalQueue.isEmpty();
    }

    @Override
    public String toString() {
        return internalQueue.toString();
    }
}

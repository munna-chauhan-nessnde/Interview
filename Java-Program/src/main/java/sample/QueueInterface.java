package sample;

public interface QueueInterface {

    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public void enQueue(Object object);
    public Object deQueue();
    public Object peek();
}

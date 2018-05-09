package sample;

public class QueueArray implements QueueInterface {

    private static final Integer INITIAL_CAPACITY = 5;
    private Object[] queueArray;
    private int front = -1;
    private int rear = -1;

    QueueArray(){
        queueArray = new Object[INITIAL_CAPACITY];
    }

    QueueArray(Integer size){
        queueArray = new Object[size];
    }

    @Override
    public int size() {
        return rear-front;
    }

    @Override
    public boolean isEmpty() {
        return (front==-1 && rear==-1);
    }

    @Override
    public void enQueue(Object object) {

        if(isFull()){
            System.out.println("Queue is full.");
        }else if(isEmpty()){
           front++;
           rear++;
        }else{
            rear++;
        }
        queueArray[rear]=object;
    }

    @Override
    public Object deQueue() {
        Object object = queueArray[front];
        front=(front+1)/INITIAL_CAPACITY;
        return object;
    }

    @Override
    public Object peek() {
        if(front==-1 && rear == -1){
            return "Queue is Empty";
        }else {
            return queueArray[front];
        }
    }

    @Override
    public boolean isFull() {
        return (rear+1)/INITIAL_CAPACITY==front;
    }
}

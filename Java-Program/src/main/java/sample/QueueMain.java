package sample;

public class QueueMain {

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.push("A");
        queue.push("B");
        queue.push("C");

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}

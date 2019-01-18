package sample;

public class Stack {

    private static class Node{

        private Node next;
        private String data;

        Node(String data){
            this.data = data;
        }
    }
    private Node top;//add and remove node
    private int size = 0;

    public boolean isEmpty(){
        return top == null;
    }
    public String peek() /*throws StackEmptyException*/{
        return top.data;
    }

    public void push(String data){

        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    public String pop() /*throws StackEmptyException*/{

        if(top == null) {
            return "Stack is alredy empty!";
            //throw new NullPointerException("Stack is alredy empty!");
        }
        String data = top.data;
        top = top.next;
        size--;
        return data;
    }
    public int size(){
        return size;
    }
}

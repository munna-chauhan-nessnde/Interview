package sample;

public class Queue {

    private static class Node {

        private Node next;
        private String data;

        Node(String data){
            this.data = data;
        }
    }

    private Node head; //for add data
    private Node tail; //to remove data
    private int size;

    public boolean isEmpty(){
        return head == null;
    }

    public String peek(){
        return head.data;
    }
    public void push(String data){

        Node node = new Node(data);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
        size++;
    }
    public String pop(){

        String data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return data;
    }
    public int size(){
        return this.size;
    }
}

package datastructure;

public class Node {

    public int data;
    public Node next;
    public Node prev;

    //Singly
    public Node(int data) {
        this.data = data;
    }
    //Doubly
    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}

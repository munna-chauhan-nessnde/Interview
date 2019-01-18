package interview;

/**
 * @Author Munna Chauhan
 * Github https://github.com/victormunna/Interview
 */
class Node {

    Node next;
    Node prev;
    int data;

    /**
     * For Singly linked List
     */
    public Node(int data) {
        this.data = data;
    }

    /**
     * For doubly linked List
     */
    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

package interview;

public class DoublyLinkedList {

    private Node head;
    private int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFront(int data) {
        if (head == null) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addRear(int data) {
        if (head == null) {
            head = new Node(null, data, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
        }
        size++;
    }

    public void removeFront() {
        if (head == null) return;
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeRear() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void insertAt(int data, int index) {
        if (head == null) return;
        if (index < 1 || index > size) return;
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (head.prev == null) {
            Node newNode = new Node(null, data, current);
            current.prev = newNode;
            head = newNode;
        } else {
            Node newNode = new Node(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}

package interview;

public class LinkedListMain {

    public static void main(String[] args) {

        DoublyLinkedList ddl = new DoublyLinkedList();
        System.out.println("|-----Size------| " + ddl.size());
        ddl.addFront(5);
        ddl.addFront(10);
        ddl.addFront(15);
        ddl.display();
        System.out.println("|-----Size------| " + ddl.size());
        ddl.addRear(20);
        ddl.addRear(25);
        ddl.display();
        System.out.println("|-----Size------| " + ddl.size());
        ddl.removeFront();
        ddl.display();
/*        System.out.println("|-----Size------| " + ddl.size());
        ddl.removeRear();
        ddl.display();*/
        System.out.println("|-----Size------| " + ddl.size());
        ddl.insertAt(50, 1);
        ddl.display();
        System.out.println("|-----Size------| " + ddl.size());
    }
}

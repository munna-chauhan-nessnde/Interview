package sample;

public class StackMain {

    public static void main(String[] args){

       // Stack stack = new Stack();
        StackArray stack = new StackArray();
        System.out.println(stack.isEmpty());
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.size());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}

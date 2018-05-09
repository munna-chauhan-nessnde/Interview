package sample;

public class StackArray implements StackInterface {

    private static final Integer INITIAL_CAPACITY = 10;
    private Integer top = -1;
    private Object[] stack;

    StackArray(){
        stack = new Object[INITIAL_CAPACITY];
    }
    StackArray(Integer n){
        stack = new Object[n];
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public Object peek() {
        if(top<0){
            System.out.println("Stack is Empty");
            return null;
        } else {
            return stack[top];
        }
    }

    @Override
    public void push(Object element) {
        stack[++top] = element;
    }

    @Override
    public Object pop() {
        Object object = stack[top];
        stack[top--] = null;
        return object;
    }
}

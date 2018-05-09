package sample;

public interface StackInterface {

    //Accessor method
    public int size();
    public boolean isEmpty();
    public Object peek() /*throws StackEmptyException*/;

    //update methods
    public void push(Object element);
    public Object pop() /*throws StackEmptyException*/;
}

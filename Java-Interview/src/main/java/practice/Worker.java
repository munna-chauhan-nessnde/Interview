package practice;

public class Worker {

    private String name;
    private Integer age;

    private void sleep(){
        System.out.println("Sleep");
    }
    static void move(){
        System.out.println("Move.");
    }

    protected void worker(){
        System.out.println("Worker.");
    }

    final void doSomething(Object object){
        System.out.println("doSomething -> Object.");
    }
    public void doSomething(Integer integer){
        System.out.println("doSomething -> Integer.");
    }

    void doSomething(char[] chr){
        System.out.println("doSomething -> char[].");
    }
}


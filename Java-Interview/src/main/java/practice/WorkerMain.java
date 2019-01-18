package practice;

public class WorkerMain {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.doSomething((Integer) null);//if you will not cast then it will show compilation exception ambiguous about method
    }
}
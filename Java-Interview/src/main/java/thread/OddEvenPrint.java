package thread;

public class OddEvenPrint {

    public static void main(String[] args) {

        Writer writer = new Writer();
        Thread odd = new Thread(new OddEvenTask(writer, 10, false));
        Thread even = new Thread(new OddEvenTask(writer, 10, true));
        odd.start();
        even.start();
    }
}

class OddEvenTask implements Runnable {

    private Writer writer;
    int max;
    private boolean isEven;

    public OddEvenTask(Writer writer, int max, boolean isEven) {
        this.writer = writer;
        this.max = max;
        this.isEven = isEven;
    }

    public void run() {

        int number = isEven == true ? 2 : 1;
        while (number <= max) {
            if (isEven) {
                writer.even(number);
            } else {
                writer.odd(number);
            }
            number = number + 2;
        }
    }
}

class Writer {

    private boolean isOdd = false;

    public synchronized void even(int number) {

        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Even = " + number);
        isOdd = false;
        notifyAll();
    }

    public synchronized void odd(int number) {

        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Odd = " + number);
        isOdd = true;
        notifyAll();
    }
}
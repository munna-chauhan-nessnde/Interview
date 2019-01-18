package practice;

public class Test {

    public static void main(String[] args) {

        System.out.println(Integer.parseInt("na"));
        A a=new A();
        Thread t1 = new Thread(() -> {
            long  s1 = System.currentTimeMillis();
            a.m1();
           // System.out.println(System.currentTimeMillis()-s1);
        });
        Thread t2 = new Thread(() -> {
            //long  s2 = System.currentTimeMillis();
            a.m2();
           // System.out.println(System.currentTimeMillis()-s2);
        });
        t1.start();
        t2.start();

    }
}

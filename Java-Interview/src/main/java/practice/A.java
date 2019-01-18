package practice;

class A
{
    synchronized void m1()
    {
        try {
            Thread.sleep(10000L);
            m2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("In m1 A");
    }
    synchronized void m2()
    {
        System.out.println("In m2 A");
    }
}
package sample;

public class BaseClass {

   /* public static String staticVar = "BaseClass Static Variable";
    public volatile String publicVolatileVar = "BaseClass Public Volatile Variable";
    public transient String publicTransientVar = "BaseClass Public Transient Variable";

    public static final String staticFinalVar = "BaseClass Static Final Variable";
    public final String finalVar = "BaseClass Final Variable";

    private String privateVar = "BaseClass Private Variable";
    protected String protectedVar = "BaseClass Protected Variable";
    public String publicVar = "BaseClass Public Variable";
    String defaultVar = "BaseClass Default Variable";*/

    public static void staticMethod(){
        System.out.println("BaseClass Static Method Invoke");
    }

    private void privateMethod(){
        System.out.println("BaseClass Private Method Invoke");
    }

    protected void protectedMethod(){
        System.out.println("BaseClass Protected Method Invoke");
    }

    public String publicMethod(Integer number){
        System.out.println("BaseClass Public Method Invoke");return "inBase " + number;
    }

    public void publicMethodWithParam(String name){
        System.out.println("BaseClass Public Method With Param Invoke");
    }

    void defaultMethod(){
        System.out.println("BaseClass Default Method Invoke");
    }
}

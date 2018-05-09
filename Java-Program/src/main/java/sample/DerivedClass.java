package sample;

public class DerivedClass extends BaseClass {

/*    public static String staticVar = "DerivedClass Static Variable";
    public volatile String publicVolatileVar = "DerivedClass Public Volatile Variable";
    public transient String publicTransientVar = "DerivedClass Public Transient Variable";

    public static final String staticFinalVar = "DerivedClass Static Final Variable";
    public final String finalVar = "DerivedClass Final Variable";

    private String privateVar = "DerivedClass Private Variable";
    protected String protectedVar = "DerivedClass Protected Variable";
    public String publicVar = "DerivedClass Public Variable";
    String defaultVar = "DerivedClass Default Variable";*/

    public static void staticMethod(){
        System.out.println("DerivedClass Static Method Invoke");
    }

    private void privateMethod(){
        System.out.println("DerivedClass Private Method Invoke");
    }

    protected void protectedMethod(){
        System.out.println("DerivedClass Protected Method Invoke");
    }

    public String publicMethod(String name, Integer number){
        System.out.println("DerivedClass Public Method Invoke");
        return "inDerived "+ name;
    }

    public void publicMethodWithParam(String name){
        System.out.println("DerivedClass Public Method With Param Invoke");
    }

    public void publicMethodWithParam(String name, String original){
        System.out.println("DerivedClass Public Method With Param Invoke");
    }

    void defaultMethod(){
        System.out.println("DerivedClass Default Method Invoke");
    }


    public void derivedClassMethod(){
        System.out.println("DerivedClass Public Method Invoke");
    }
}

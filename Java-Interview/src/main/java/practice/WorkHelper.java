package practice;

public class WorkHelper extends Worker{

    public void sleep(){//in parent it is private so here it is a new method not overridden method
        System.out.println("Sleep");
    }
/*    public void move(){//for static method in child if your method without static keyword it will so compilation issue
        System.out.println("Move.");
    }*/
    static void move(){
        System.out.println("Move.");
    }

    public void worker(){
        System.out.println("WorkHelper.");
    }

    public void doSomething(Integer integer){
        System.out.println("doSomething -> Integer.");
    }
//
    protected void doSomething(char[] chr){//if method is default,then it will only overridden in same package, in other package
        //in other package it will be new method
        System.out.println("doSomething -> char[].");
    }

/*    public void doSomething(Object object){//if parent method is final then you can't override
        System.out.println("doSomething -> Object.");
    }*/
}

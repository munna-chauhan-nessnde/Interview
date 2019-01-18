package sample;

public class InheritanceMain {

    public static void main(String[] arg){

        BaseClass baseClass = new BaseClass();
        DerivedClass derivedClass = new DerivedClass();
        BaseClass derivedAssignInBase = new DerivedClass();
       // DerivedClass dbClass = new BaseClass();

       // derivedClass.publicMethodWithParam("");
       // derivedClass.publicMethodWithParam("", "");
       // derivedAssignInBase.publicMethodWithParam("");
        //derivedAssignInBase.publicMethod("New Test");
        derivedAssignInBase.publicMethod(26);
    }
}

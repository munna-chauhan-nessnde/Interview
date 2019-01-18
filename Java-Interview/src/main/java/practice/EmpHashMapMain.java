package practice;

import java.util.HashMap;
import java.util.Map;

public class EmpHashMapMain {

    public static void main(String[] args) {
        Employee emp1=new Employee("Martin",27);
        Map<Employee,String> hm=new HashMap<Employee,String>();
        hm.put(emp1, "Verified");
        emp1.setName("John");
        System.out.println(hm.get(emp1));
    }
}

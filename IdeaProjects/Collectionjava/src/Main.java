

import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        HashMap<Employee ,Double> obj = new HashMap<Employee,Double>();
        Employee e1 = new Employee("Geetanjali",22,"Software Engineer" , 43400);
        Employee e2 = new Employee("Anjali",24,"Devops Engineer" , 65000);
        Employee e3 = new Employee("Geetanjali",22,"Quality  Engineer" , 123400);
        Employee e4 = new Employee("Geetanjali",22,"Software Developer  " , 83000);

        obj.put(e1,e1.salary);
        obj.put(e2,e2.salary);
        obj.put(e3,e3.salary);
        obj.put(e4,e4.salary);
        System.out.println(obj.get(e3));

    }

}
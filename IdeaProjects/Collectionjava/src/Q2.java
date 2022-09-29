import  java.util.*;
import  java.util.Comparator;

class Employee implements  Comparable<Employee> {

    Double age;
    Double salary;
   public String name;

    Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name :"  +this.name + "Salary :" + this.salary+ "Age : " + this.age;
    }

    @Override
    public int compareTo(Employee o) {
       return name.compareTo(o.name);

    }


//    public static Comparator<Employee>
//
//    }

}





public class Q2 {

    public static void main(String[] args){
        List<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee( 22.1, 40000.05 ,  "gunjan pandey" ));
        employeeList.add(new Employee( 23.4, 40000.02 ,  "gunjan bisht" ));
        employeeList.add(new Employee( 23.2, 40000.03 ,  "mohit rawat" ));

        




    }
}

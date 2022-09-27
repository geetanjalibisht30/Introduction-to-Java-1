public class Employee {


    private  String firstname;
    private String lastname;
    private  int age ;
    private  String designation;
    Employee(){
        this.firstname = "Geetanjali";
        this.lastname ="Bisht";
        this.age =22;
        this.designation ="SE";
    }
    Employee(String firstname, String lastname, int age , String designation){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }
    public void setFirstName(String firstname){
            this.firstname = firstname;
    }
    public void setLastName(String lastname){
        this.lastname= lastname;
    }
   public void setAge(int age){
        this.age= age;
   }
   public void setDesignation(String  designation){
        this.designation=designation;
   }
   @Override
    public String toString(){
        return  "First Name :" +firstname+ "  Last Name :" +lastname+ "Age  :" +age+
                " Designation :" +designation ;

    }
    public  static  void main(String args[]){
        Employee obj1 = new Employee();
        Employee obj2 = new Employee("Geetanjali", "Bisht",22,"SE" );

        System.out.println(obj1);

        System.out.println(obj2);

        obj2.setFirstName("GEETA");
        obj2.setLastName("BISHT");
        obj2.setAge(22);
        obj2.setDesignation("JVM SE");
        System.out.println(obj2);
    }


}

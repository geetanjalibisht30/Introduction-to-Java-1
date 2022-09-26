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


}

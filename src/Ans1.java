import java.util.Scanner;

public class Ans1 {
        static String firstname;
        static  String lastname;
        static int age ;
        static {
            firstname = "Geetanjali";
            lastname = "Bisht";
            age = 22;
        System.out.println("Static Block.   ");
        System.out.println("FirstName - " +firstname );
        System.out.println("LastName - " +lastname );
        System.out.println("Age - " + age );

        }
public static void Hello()
        {

        System.out.println("Static Method.  ");
        System.out.println("FirstName - " +firstname );
        System.out.println("LastName - " +lastname );
        System.out.println("Age - " + age );
        }
public static void main(String []args){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the first name " );
       firstname =obj.nextLine();
    System.out.println("Enter the last name " );
       lastname =obj.nextLine();
    System.out.println("Enter the Age " );
       age =obj.nextInt();


        System.out.println(" Static Variable..   ");
        System.out.println("FirstName - " +firstname );
        System.out.println("LastName - " +lastname );
        System.out.println("Age - " + age );
        Hello();
        }
        }





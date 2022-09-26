public class Q1 {
    static String firstname = "Geetanjali";
    static  String lastname ="Bisht";
    static int age = 22;
    static {

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

        System.out.println(" Static Variable..   ");
        System.out.println("FirstName - " +firstname );
        System.out.println("LastName - " +lastname );
        System.out.println("Age - " + age );
        Hello();
    }
    }



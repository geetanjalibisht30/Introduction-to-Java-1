import java.util.*;
public class Circle {
    public static float pi =3.14f;
    public static void area_circle(){
        System.out.println("");
        Scanner obj = new Scanner(System.in);
        float r = obj.nextFloat();
        System.out.println(pi*r*r);
    }
    public static void circumference(){
        System.out.println("Enter Radius :");
        Scanner obj = new Scanner(System.in);
        float r = obj.nextFloat();
        System.out.println(2*pi*r);
    }
    public static  void main(String [] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("1. Calculate Area of Circle.");
        System.out.println("2. Calculate Circumference of a Circle.");
        System.out.println("3. Exit.");
        int num = obj.nextInt();
        switch (num){
            case 1:
                area_circle();
                break;
            case 2:
                circumference();
                break;
            default:
                System.out.println(" Exit");
        }
    }
}
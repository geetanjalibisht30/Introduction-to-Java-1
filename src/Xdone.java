import java.util.*;
public class Xdone {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        List<String> c=new ArrayList<>();
        System.out.println("Enter");
        while (true) {

            String s = obj.nextLine();
            if (s.equals("XDONE")) {
                break;
            }
            c.add(s);
        }
            System.out.println(c);
    }
}

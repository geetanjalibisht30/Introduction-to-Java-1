//import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;


public class SumOfList {

    public static void main(String[] args) {
        Float sum =0.0f;
        List<Float> list = new ArrayList<Float>();
        list.add(20.1f);
        list.add(3.23f);
        list.add(10.3f);
        list.add(32.2f);
        list.add(20.4f);

        Iterator<Float> it = list.iterator();

        while (it.hasNext()){

            float i= it.next();
            sum += i;
        }
        System.out.println( "sum of the numbers in List  : " + sum);

    }

}



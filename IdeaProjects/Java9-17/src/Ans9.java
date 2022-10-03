import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ans9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Unmodifiable list 1:");
        List<Integer> unmodify = List.copyOf(list);
        unmodify.add(9);

        System.out.println("Unmodifiable list 2:");

        List<Integer> unmodify2 = list.stream().filter(e->e%2==0).collect(Collectors.toUnmodifiableList());
        unmodify2.add(9);


    }
}

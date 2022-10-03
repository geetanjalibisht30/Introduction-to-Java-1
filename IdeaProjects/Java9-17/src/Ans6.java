import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class Ans6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println(list.stream().filter(e->e%2==0).findFirst().stream().collect(Collectors.toList()));
    }
}

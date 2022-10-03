import java.util.*;
import java.util.stream.IntStream;

public class Ans5 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,22,13,16,20);
        System.out.println("---------------------ifPresentOrElse------------------------------");
        list.stream().filter(e->e>16).findFirst()
                .ifPresentOrElse(System.out::println,()->System.out.println("hello world"));

        System.out.println("----------------------orELseThrow------------------------------------");
        list.stream().filter(e->e>100).findFirst().orElseThrow();
    }
}

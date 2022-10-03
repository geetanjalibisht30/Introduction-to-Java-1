import java.util.stream.IntStream;

public class Ans4 {
    public static void main(String[] args) {
        IntStream.iterate(0,e->e<30,e->e+2).forEach(System.out::println);
    }
}

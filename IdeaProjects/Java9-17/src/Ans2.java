import java.net.SocketOption;
import java.util.Arrays;
import java.util.*;
public class Ans2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("----------- takeWhile---------------");

        list.stream().takeWhile(e->e<5).forEach(System.out::println);

        System.out.println("----------- dropWhile---------------");
        list.stream().dropWhile(e->e<6).forEach(System.out::println );

    }
    }


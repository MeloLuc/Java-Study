package stream.exe01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 4, 5, 7, 8, 23);

        //creating streams
        Stream<Integer> st1 = list.stream().map(x -> x * 10); //colletion
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("lucas", "de", "melo"); //Stream.of
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); //iterate(start, function)
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // sob demanda (lazy)

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]); //fibonacci
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}

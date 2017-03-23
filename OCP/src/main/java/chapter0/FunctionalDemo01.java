import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by m60095a on 7-3-2017.
 */
public class FunctionalDemo01 {

    public static void main(String[] args) {

//        Predicate<? super String> pred = s -> s.startsWith("G");
//        Stream<String> stream1 = Stream.generate(() -> "Growl");
//        System.out.println(stream1.anyMatch(pred));
//
//        Predicate<? super String> pred2 = s -> s.length() > 3;
//        // Stream<String> stream2 = Stream.iterate("-", (s) -> s + s);
//
//        stream2.forEach(System.out::println);
//
//        IntStream intStream = IntStream.empty();
//
//        LongStream ls = LongStream.of(1,2,3);
//        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
//
//        List<Integer> l1 = Arrays.asList(1,2,3);
//        List<Integer> l2 = Arrays.asList(4,5,6);
//        List<Integer> l3 = Arrays.asList();
//
//
//        Stream<String> s1 = Stream.empty();
//        Stream<String> s2 = Stream.empty();
//        Map<Boolean, List<String>> p = s1.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
//        Map<Boolean, List<String>> g = s1.collect(Collectors.groupingBy(b -> b.startsWith("c")));


        System.out.println("Hard way");
        List<Integer> list = IntStream.range(1,6).mapToObj(x -> x).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("Simple way");
        IntStream.range(1,6).forEach(System.out::println);







    }
}

package day01_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionTest {
    public static void main(String[] args) {

        Runnable runnable = ()->{
            System.out.println("First task");
            System.out.println("Second task");
        };
        runnable.run();

        Supplier<String> supplier = () -> "Hello, Supplier!";
        String result = supplier.get();
        System.out.println(result);

        Consumer<String> consumer = message -> System.out.println("Consumer : " + message);

        consumer.accept("Hello, Consumer!");

        Function<Integer, String> function = number -> "Number: " + number;

        String result1 = function.apply(10);
        System.out.println(result1);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        boolean result2 = isEven.test(10);
        System.out.println("Is Even? " + result2);

        BiConsumer<String, Integer> printEntry = (key, value) -> System.out.println("key: " + key + " value: " + value);

        Map<String, Integer> map = new HashMap<>();
        map.put("한인호",20);
        map.put("이재원",21);
        map.put("Three",3);

        map.forEach(printEntry);

        BiPredicate<Integer, String> isLengthEqual = (length, str) -> str.length() == length;
        boolean result3 = isLengthEqual.test(3,"abc");
        System.out.println(result3);

        BiFunction<String, String, String> concatStrings = (str1, str2) -> str1 + " " + str2;
        String str = concatStrings.apply("abc","def");
        System.out.println(str);

        List<String> names = Arrays.asList("John","Doe","Alice","Bob");
        names.forEach(name-> System.out.println(name));
        names.forEach(System.out::println);

        BiFunction<String,String,Boolean> startsWithLambda = (str1,prefix) -> str1.startsWith(prefix);
        BiFunction<String,String,Boolean> startsWithRef = String::startsWith;
        boolean resultLambda1 = startsWithLambda.apply("Hello,World","Hello");
    }
}

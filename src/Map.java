//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public static void main(String[] args) {


    List<String> names = List.of("Alice", "Bob", "Charlie", "Anna");

// To List - names starting with A, uppercased
    List<String> nameList = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
// [ALICE, ANNA]
       System.out.println(nameList);

// To Set - all names uppercased
    Set<String> nameSet = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toSet());
// [ALICE, BOB, CHARLIE, ANNA]

    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

// Sum - double each number first, then sum
    int sum = numbers.stream()
            .map(n -> n * 2)
            .reduce(0, (a, b) -> a + b);
// sum = 30  (1+2+3+4+5 = 15, doubled = 30)

// Max - square each number first, then find max
    Optional<Integer> max = numbers.stream()
            .map(n -> n * n)
            .reduce((a, b) -> a > b ? a : b);
// max = Optional[25]  (5² = 25)

    System.out.println("nameList = " + nameList);
    System.out.println("nameSet  = " + nameSet);
    System.out.println("sum      = " + sum);
    System.out.println("max      = " + max.orElse(0));



    List<String> str = List.of("Hi", "Hello");

    str.parallelStream()
            .map(word -> word.split(""))
            .flatMap(Arrays::stream)
            .forEach(System.out::println);





}

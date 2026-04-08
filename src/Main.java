//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public static void main(String[] args) {


    List<String> names = List.of("Alice", "Bob", "Charlie", "Anna");

// To List
    List<String> nameList = names.stream()
            .filter(n -> n.startsWith("A"))
             .collect(Collectors.toList());
// [Alice, Anna]

// To Set
    Set<String> nameSet = names.stream()
            .collect(Collectors.toSet());
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

// Sum
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);  // identity, accumulator
// sum = 15

// Max
        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);
// max = 5
    System.out.println("nameList = " + nameList);
    System.out.println("nameSet  = " + nameSet);
    System.out.println("sum      = " + sum);
    System.out.println("max      = " + max);
    System.out.println("max value = " + max.get());


    }

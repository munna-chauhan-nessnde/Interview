package practice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;

public class BigDecimalReduce {

    public static void main(String[] args) {

        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

        final BigDecimal totalOfDiscountedPrices =
                prices.stream()
                        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                        .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

       // System.out.println(totalOfDiscountedPrices);

        final List<String> names = Arrays.asList("Ndn","Raj","King","sun","Earth");
        //System.out.println(names.stream().filter(e -> e.contains("sun")).map(String::toString).reduce(String::concat).orElse(null));
        final List<String> friends =
                Arrays.asList("Suian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final Function<String, Predicate<String>> startsWithLetter =
                letter -> name -> name.startsWith(letter);

        final long countFriendsStartN = friends.stream()
                        .filter(startsWithLetter.apply("N")).count();
        final long countFriendsStartB = friends.stream()
                        .filter(startsWithLetter.apply("B")).count();
       // System.out.println("countFriendsStartN = " + countFriendsStartN);
       // System.out.println("countFriendsStartB = " + countFriendsStartB);
        final Optional<String> friendsStartN = friends.stream()
                        .filter(startsWithLetter.apply("N")).findFirst();
       // friendsStartN.ifPresent(name -> System.out.println(name));
       // System.out.println(friendsStartN.orElse("Not Found."));

        System.out.println("Total number of characters in all names: " +
                friends.stream()
                        .mapToInt(name -> name.length())
                        .sum());
        final Optional<String> aLongName = friends.stream()
                        .reduce((name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));


        final List<Integer> numbers =
                Arrays.asList(-1,0,5,13,8,3,5,11);
        Integer number = numbers.stream()
                .reduce((num1, num2) ->
                        num1>= num2 ? num1 : num2).get();
        System.out.println(number);

        Integer max = numbers
                .stream()
                .mapToInt(v -> v)
                .max().getAsInt();
        System.out.println(max);

        final String steveOrLonger =
                friends.stream()
                        .reduce("Steve", (name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
        System.out.println(steveOrLonger);
        System.out.println(String.join(", ", friends));
        System.out.println(
                friends.stream()
                        .map(String::toUpperCase)
                        .collect(joining(", ")));
    }
}

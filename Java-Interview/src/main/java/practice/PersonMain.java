package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class PersonMain {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Rhino", 45),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35),
                new Person("John", 20));

        List<Person> ascendingAge =
                people.stream()
                        .sorted((person1, person2) -> person1.ageDifference(person2))
                        .collect(toList());
       // System.out.println(ascendingAge);
/*        System.out.println(
                people.stream()
                        .sorted(Person::ageDifference)
                        .collect(toList())
        );*/
        System.out.println(
                people.stream()
                        .sorted(Comparator.comparingInt(Person::getAge))
                        .collect(toList())
        );
        List<Person> descendingAge =
                people.stream()
                        .sorted((person1, person2) -> person2.ageDifference(person1))
                        .collect(toList());
        System.out.println(descendingAge);

        System.out.println(
                people.stream()
                        .sorted(Comparator.comparingInt(Person::getAge).reversed())
                        .collect(toList())
        );

        Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);
        Comparator<Person> compareDescending = compareAscending.reversed();
        System.out.println(
                people.stream()
                        .sorted(compareAscending)
                        .collect(toList())
        );
        System.out.println(
                people.stream()
                        .sorted(compareDescending)
                        .collect(toList())
        );
        System.out.println( people.stream()
                .sorted((person1, person2) ->
                        person1.getName().compareTo(person2.getName()))
                .collect(toList()));
        System.out.println( people.stream()
                .sorted(comparing(Person::getName))
                .collect(toList()));
        people.stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
        people.stream()
                .max(Person::ageDifference)
                .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
        final Function<Person, Integer> byAge = person -> person.getAge();
        final Function<Person, String> byTheirName = person -> person.getName();
        System.out.println("Sorted in ascending order by age and name: "+
                people.stream()
                        .sorted(comparing(byAge).thenComparing(byTheirName))
                        .collect(toList()));

        List<Person> olderThan20 =
                people.stream()
                        .filter(person -> person.getAge() > 20)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
                        //.collect(toList());
        System.out.println("People older than 20: " + olderThan20);
        System.out.println("----------------------------------------------------------------------");
        Map<Integer, List<Person>> peopleByAge =
                people.stream()
                        .collect(groupingBy(Person::getAge));
        System.out.println("Grouped by age: " + peopleByAge);
        Map<String, List<Person>> peopleByName =
                people.stream()
                        .collect(groupingBy(Person::getName));
        System.out.println("Grouped by name: " + peopleByName);
        Map<Integer, List<String>> nameOfPeopleByAge =
                people.stream().collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));
        System.out.println("People grouped by age: " + nameOfPeopleByAge);

        Comparator<Person> by_Age = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonOfEachLetter =
                people.stream()
                        .collect(groupingBy(person -> person.getName().charAt(0),
                                reducing(BinaryOperator.maxBy(by_Age))));
        System.out.println("Oldest person of each letter:");
        System.out.println(oldestPersonOfEachLetter);
        System.out.println("----------------------------------------------------------------------");
        try {
            Files.list(Paths.get("."))
                    .forEach(System.out::println);
            System.out.println("----------------------------------------------------------------------");
            Files.list(Paths.get("."))
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);
            System.out.println("----------------------------------------------------------------------");
            final String[] files =
                    new File("E:\\IdeaProject\\HackerRank\\src\\main\\java\\practice").list(new java.io.FilenameFilter() {
                        public boolean accept(final File dir, final String name) {
                            return name.endsWith(".java");
                        }
                    });
            Arrays.stream(files).forEach(System.out::println);
            System.out.println("----------------------------------------------------------------------");
            Files.newDirectoryStream(
                    Paths.get("E:\\IdeaProject\\HackerRank\\src\\main\\java\\overriding"), path -> path.toString().endsWith(".java"))
                    .forEach(System.out::println);
            final File[] files1 = new File(".").listFiles(file -> file.isHidden());
            System.out.println("----------------------------------------------------------------------");
            Arrays.stream(files1).forEach(System.out::println);
            Arrays.stream(new File(".").listFiles(File::isHidden)).forEach(System.out::println);
            System.out.println(new File(".").listFiles(File::isHidden));
            System.out.println("----------------------------------------------------------------------");
            listTheHardWay();
            System.out.println("----------------------------------------------------------------------");
            betterWay();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listTheHardWay() {
        List<File> files = new ArrayList<>();
        File[] filesInCurrentDir = new File(".").listFiles();
        for(File file : filesInCurrentDir) {
            File[] filesInSubDir = file.listFiles();
            if(filesInSubDir != null) {
                files.addAll(Arrays.asList(filesInSubDir));
            } else {
                files.add(file);
            }
        }
        System.out.println("Count: " + files.size());
        files.forEach(System.out::println);
    }

    public static void betterWay() {
        List<File> files =
                Stream.of(new File(".").listFiles())
                        .flatMap(file -> file.listFiles() == null ?
                                Stream.of(file) : Stream.of(file.listFiles()))
                        .collect(toList());
        System.out.println("Count: " + files.size());
    }
}

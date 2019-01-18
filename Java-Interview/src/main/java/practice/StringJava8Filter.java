package practice;

public class StringJava8Filter {
    public static void main(String[] args) {
        final String str = "w00t";
        //str.chars().forEach(ch -> System.out.println(ch));
        str.chars().forEach(System.out::println);
        str.chars().mapToObj(ch -> Character.valueOf((char)ch)).forEach(System.out::println);
        str.chars().filter(Character::isDigit).forEach(ch -> System.out.println((char)ch));

    }
}

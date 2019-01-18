package practice;

public class Switch {

    public static void main(String[] args) {

        String str = null;
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "Two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}

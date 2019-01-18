package overriding;

public class Animal {

    protected Food seekFood() {

        System.out.println("animal seeking for food code...");

        return new Food();
    }
}

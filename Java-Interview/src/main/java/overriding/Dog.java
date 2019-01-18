package overriding;

public class Dog extends Animal {

    protected Food seekFood() {//That’s perfectly a legal overriding, and the return type of Dog’s seekFood()
        // method is known as covariant return type.

        System.out.println("dog seeking for food code...");

        return new DogFood();
    }
/*protected String seekFood() {//class won’t compile if we change the seekFood() method’s return type to another

   System.out.println("dog seeking for food code...");

    return new String();
}*/

}

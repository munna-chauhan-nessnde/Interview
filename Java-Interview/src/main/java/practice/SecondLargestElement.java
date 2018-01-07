package practice;

/**
 * Find Second Largest element from array
 */
public class SecondLargestElement {

    public static void main(String[] args) {

        int[] array = {200, 4, 5, 7, 35, 23, 43, 11, -32, 2, 4, 76, 8, 55, -2, 100};

        int MAX = 0;
        int MIN = 0;
        int size = array.length;
        int secondLargest = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] >= MAX) {
                secondLargest = MAX;
                MAX = array[i];
            } else if (array[i] >= secondLargest){
                secondLargest = array[i];
            }else if(array[i] <= MIN){
                MIN = array[i];
            }
        }
        System.out.println("MAX: " + MAX);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("MIN: " + MIN);
    }
}


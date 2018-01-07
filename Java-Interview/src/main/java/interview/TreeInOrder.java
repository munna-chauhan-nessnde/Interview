package interview;

/**
 * @Author Munna Chauhan
 * Github https://github.com/victormunna/Interview
 * Tree In Order left-then-root-then-right
 * <p>
 * Tree Pre Order root-then-left-then-right
 * <p>
 * Tree Post Order left-then-right-then-root
 */
public class TreeInOrder {

    TreeInOrder left, right;
    int data;

    public TreeInOrder(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new TreeInOrder(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new TreeInOrder(value);
            } else {
                right.insert(value);
            }

        }
    }

    public boolean contains(int value) {

        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else if (value > data) {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
        return false;
    }

    public void printInOrder() {

        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
        System.out.println(right);
    }
}
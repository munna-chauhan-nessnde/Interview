package hackerrank;

public final class MyString {

    private char[] value;
    private byte coder;
    private int length;


    public MyString() {
    }

    public MyString(char c[]) {
        length = c.length;
        value = new char[length];
        System.arraycopy(c, 0, value, 0, length);
    }

    public String toString() {
        return new String(value);
    }

    public int length() {
        return length;
    }
}

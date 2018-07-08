package com.vm.program;

/*
 * Finally block return test if exception comes inside try block
 *
 * */
public class FinallyBlockTest {

    public static void main(String[] args) {
        System.out.println(tryCatch());
    }

    private static int tryCatch() {
        try {
            System.out.println("Inside try");
            return 5 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Inside ArithmeticException");
            return 2;
        } catch (Exception e) {
            System.out.println("Inside Exception");
            return 0;
        } finally {
            System.out.println("Inside finally");
            return 10;
        }
    }
}
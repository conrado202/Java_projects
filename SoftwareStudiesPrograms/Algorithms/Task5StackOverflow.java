package ALGO_Lab;

public class Task5StackOverflow {
    public static void main(String[] args) {

        fun(5);

    }

    public static void fun(int number) {

        // To catch StackOverflow error, we shall use error handling
        // Function try->catch allows to catch an error for StackOverflow (special method used)
        // as result inform user that the stack if overflowed

        try {
            fun(number - 1);
        } catch (StackOverflowError ex) {
            System.out.println("StackOverflow error occurred");
        }
    }
}

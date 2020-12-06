import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6EuclidesAlgorithmLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insert integer number a : ");
            int a = scanner.nextInt();
            System.out.println("Insert integer number b : ");
            int b = scanner.nextInt();
            System.out.println("The most common divider of inserted numbers: a = " + a + " and b = " + b + " is " + NWD(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Inserted number is not integer!");
        }
    }

    public static int NWD(int x, int y) {

        do {
            if (x > y) {
                x = x - y;
            } else if (y > x) {
                y = y - x;
            } else if (x == y) {
                return x;
            }
        } while (x != y);
        return x;
    }
}

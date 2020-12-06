package ALGO_Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6EuclidesAlgorithmRecc {
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

        if (y != 0) {
            return NWD(y, x % y);
        } else {
            return x;
        }
    }
}

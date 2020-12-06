package ALGO_Lab;

// Algorytm rozwiazany rekurencyjnie
import java.util.Scanner;

public class Task6EuclidesRecKK
{
    public static int NWD(int x, int y)
    {
        if(y != 0)
        {
            return NWD(y, x % y);
        }

        else
        {
            System.out.println("Highest common divisor: " + x);
            return x;
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values x and y");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        NWD(x, y);
    }
}

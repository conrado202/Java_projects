package ALGO_Lab;

import java.util.Random;
import java.util.Scanner;

public class Task2NumberGuess {
    public static void main(String[] args) {

        returnResult();

    }

    public static int loadRandom(){
        Random generator = new Random();
        return (generator.nextInt(100)+1);
    }

    public static void returnResult(){
        int randNumber = loadRandom();
        Scanner scanner = new Scanner(System.in);

        outerloop:
        while(true){
            System.out.println("Insert your number: ");
            int scan1 = scanner.nextInt();

            if(scan1 < 0 || scan1 > 100){
                System.out.println("Number is not between (0, 100). I'm finishing program.");
                break;
            }

            if(scan1 < randNumber){
                System.out.println("Your number is lower than mine.");
            } else if(scan1 > randNumber){
                System.out.println("Your number is greater than mine.");
            } else {
                System.out.println("Your number is the same as mine. Congrats!");
                break outerloop;
            }
        }

    }

    /*public static void returnResult(){
        int randNumber = loadRandom();
        Scanner scanner = new Scanner(System.in);

        int insertedNumber = 0;
        do {
            System.out.println("Insert number: ");
            insertedNumber = scanner.nextInt();
            if (randNumber > insertedNumber){
                System.out.println("Your number is smaller than mine.");
            } else if (randNumber < insertedNumber){
                System.out.println("Your number is greater then mine.");
            }
        } while (randNumber != insertedNumber);
        System.out.println("Your number is the same!");
    }*/
}

package ALGO_Lab;

import java.util.Random;
import java.util.Scanner;

public class Task3RandomNumber {

    public static void main(String[] args) {

        returnResult();

    }

    public static int loadRandom(int min, int max){
        Random generator = new Random();
        return (generator.nextInt(max - min + 1) + min);
    }

    /*public static void returnResult(){
        int randNumber = loadRandom();
        Scanner scanner = new Scanner(System.in);

        outerloop:
        while(true){
            System.out.println("Insert your number: ");
            int scan1 = scanner.nextInt();

            if(scan1 < randNumber){
                System.out.println("Your number is lower than mine.");
            } else if(scan1 > randNumber){
                System.out.println("Your number is greater than mine.");
            } else{
                System.out.println("Your number is the same as mine. Congrats!");
                break outerloop;
            }
        }

    }*/

    public static void returnResult(){
        int min = 1;
        int max = 100;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int scan1 = scanner.nextInt();

        outerloop:
        while (true){
            int number = loadRandom(min, max);
            if(scan1 > number){
                min = number + 1;
                System.out.println("Generated comp number is " + number);
                System.out.println("Random number is lower than yours");
                counter++;
            } else if(scan1 < number){
                max = number - 1;
                System.out.println("Generated comp number is " + number);
                System.out.println("Random number is greater than yours");
                counter++;
            } else {
                System.out.println("Congrats! You reach your point in " + counter + " steps.");
                break outerloop;
            }
        }

    }

}

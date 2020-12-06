import java.util.Scanner;

public class Task1BMICalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert you weight in [kg]: ");
        double weight1 = scanner.nextDouble();
        System.out.println("Insert you height in [m]: ");
        double height1 = scanner.nextDouble();

        System.out.println("Your BMI index is: " + calculate(height1, weight1));
    }

    public static double calculate(double height, double weight){
        return weight/(height*height);
    }
}


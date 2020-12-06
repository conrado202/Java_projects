import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Enter quantity of marks*/
        System.out.println("Insert quantity of marks: ");
        int markQuantity = scanner.nextInt();

        /*Enter the marks*/
        int[] input = new int[markQuantity];
        System.out.println("Insert marks: ");
        for (int i=0; i<markQuantity; i++){
            int markInput = scanner.nextInt();

                /*Not properly done idea of chekcing of mark is in boundary of <1,6> -> array size is making trouble*/
                /*if(markInput < 1 || markInput > 6){
                    System.out.println("No way!");
                    i--;
                    input [i] = input[i-1];
                } else*/

             input[i] = markInput;
        }

        /*Show results on screen*/
        System.out.println("Average from your marks is: " + averageMark(input));
        System.out.println("Max from your marks is: " + maxMark(input));
        System.out.println("Min from your marks is: " + minMark(input));

    }

    /******************METHODS*******************/
    /*Method for counting average marks*/

    public static double averageMark(int[] marks){
        int sum = 0;

        for (int i=0; i<marks.length; i++){
            /*if(marks[i] < 1 || marks[i] > 6){
                i--;
                marks.length = marks.length-1;
            }*/
            sum += marks[i];
        }
        return (double)sum / marks.length;
       }

    public static int maxMark(int[] marks){
        int max = marks[0];
        for (int i=0; i<marks.length; i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        return max;
    }

    public static int minMark(int[] marks){
        int min = marks[0];
        for (int i=0; i<marks.length; i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
        return min;
    }
}

        /*Method for counting average marks*/
        /*public static double averageMark(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give number of marks from which do you want to calculate average:");
        int numberMarks = scanner.nextInt();

        System.out.println("Give specific marks:");
        int[] marks = new int[numberMarks];
        int sum = 0;

            for (int i=0; i<numberMarks; i++){
                int mark = scanner.nextInt();
                marks[i] = mark;
                sum += marks[i];
            }

            return (double)sum / numberMarks;
       }*/


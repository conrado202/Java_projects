import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {

/*Show results on the screen, callout for method*/
        printDividers();
		
    }

/**************METHODS**************/

/* Method for read number from keyboard */
    public static int readNumber(){
        System.out.println("Insert number: ");
        return new Scanner(System.in).nextInt();
    }

/* Method for check divider of numbers */
    public static boolean checkDivider(int number, int divider){
        return number % divider == 0;
    }

/* Method for finding dividers for readout number */
    public static int[] findDividers(){
        int arrSize = 100;
        int x = readNumber();

        ArrayList<Integer> listDivider = new ArrayList<>(arrSize);

        if(x !=0){
            for(int i = 1; i <= x/2; i++){
                if(checkDivider(x,i)){
                    listDivider.add(i);
                }
            }
            listDivider.add(x);
        }
        else
            System.out.println("No possibility to divide by 0");

        int[] returnedInteger = listDivider.stream().mapToInt(Integer::valueOf).toArray();
        return returnedInteger;
    }

/* Method for printing dividers on the screen */
    public static void printDividers(){
		
        System.out.print("Your dividers of number are: " + Arrays.toString(findDividers()));
		
    }

}

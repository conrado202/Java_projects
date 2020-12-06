package ALGO_Lab;

import java.util.Arrays;
import java.util.Random;

public class Task4SortTable {
    public static void main(String[] args) {

        //Printing out sorted array from dedicated number of elements
        System.out.println("Array after sort: " + Arrays.toString(sortArr(unsortedArray(500))) + "\n");
        System.out.println("Array after sort: " + Arrays.toString(sortArr(unsortedArray(1000))) + "\n");
        System.out.println("Array after sort: " + Arrays.toString(sortArr(unsortedArray(2500))) + "\n");

    }

    public static int[] unsortedArray(int size){
        Random random = new Random();
        int[] arrBeforeSort = new int[size];
        long startUnsorted = System.currentTimeMillis();



        //Generation of unsorted array containing random int numbers
        for (int i = 0; i < size; i++){
            arrBeforeSort[i] = random.nextInt();
        }

        //Returning unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(arrBeforeSort));

        // Calculation of the time for unsorted array generation
        long finishUnsorted = System.currentTimeMillis();
        long timeElapsedUnsorted = finishUnsorted - startUnsorted;
        System.out.println("Time for " + size + " elements array before sorting: " + timeElapsedUnsorted+ " ms");

        return arrBeforeSort;
    }



    public static int[] sortArr(int[] ints) {

        long startSorted = System.currentTimeMillis();

        for (int i = 0; i < (ints.length)-1; i++)
        {
            //Search for min element in array - unsorted one
            int minElement = i;
            for (int j = i+1; j < ints.length; j++)
                if (ints[j] < ints[minElement])
                    minElement = j;

            //Exhange min element with new one
            int temp = ints[minElement];
            ints[minElement] = ints[i];
            ints[i] = temp;
        }

        // Calculation of the time for sorted array generation from unsorted array
        long finishSorted = System.currentTimeMillis();
        long timeElapsedSorted = finishSorted - startSorted;
        System.out.println("Time for sorting array: " + timeElapsedSorted + " ms");

        return ints;
    }

}

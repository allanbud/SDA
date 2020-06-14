package Exercises;

//Write a Java program to find the kth smallest and largest element in a given array.
//Elements in the array can be in any order.
//if k = 2 then second smallest is 3, second biggest is 25
import java.util.Arrays;
public class E_161 {


    private static int[] OriginalArray = {1, 4, 17, 7, 25, 3, 100};
    private static int K = 2;

    public static int[] sortArrays(int[] array)
    {
        for (int j = 0; j < array.length - 1; j++) {

            if (array[j] > array[j + 1]) {

                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

                j = -1;
            }
        }

        return array; }





//Not checking for illegal K

    public static void main(String[] args) {

        Arrays.sort(OriginalArray);

        System.out.println(K + " smallest is " + OriginalArray[K-1]);
        System.out.println(K + " largest is " + OriginalArray[OriginalArray.length - K]);
        System.out.println();

        int[] SortedByLooparray = sortArrays(OriginalArray);
        System.out.println("Sorted array: "+ Arrays.toString(SortedByLooparray));
    }

}

package Exercises;
/*
131. Write a Java program to find the new length of
a given sorted array
where each element appear only once (remove the duplicates ).
 */
import java.util.Arrays;

class E_131 {

    private static int[] OriginalArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};

// Method check if NewArray contains numbers from OriginalArray
    public static boolean check(int[] NewArray, int toCheckValue)
    {
        for (int element : NewArray) {
            if (element == toCheckValue) {
                return true;
            }
        }return  false;
    }

// Main program
    public static void main(String[] args)
    {
        int n = 0;
//Making temp NewArray with same length as OriginalArray
//accepting new elements from OriginalArray only if they
//dont exist already in NewArray
        int[] NewArray = new int[OriginalArray.length];
        NewArray[n] = OriginalArray[0];
        for (int i = 1; i < OriginalArray.length; i++){
            if (!check(NewArray, OriginalArray[i])) {
                n++; NewArray[n] = OriginalArray[i];
            }
        }
//Creating final SortedArray from NewArray with length n+1
        int[] SortedArray = new int[n+1];
        for (int i = 0; i < n+1; i++)
            SortedArray[i] = NewArray[i];

//Printing the result
        System.out.println("Original array: " + Arrays.toString(OriginalArray));
        System.out.println("Sorted array: " + Arrays.toString(SortedArray));
        System.out.println("Sorted array length: " + SortedArray.length) ;
    }
}
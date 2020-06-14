package Exercises;/*
Write a Java program to create a new array from a given array of integers,
new array will contain the elements from the given array after the last element value 10.
 */
import java.util.Arrays;

public class E_103
{
    public static void main(String[] args) {
//
        int[] GivenArray = {11, 10, 13, 10, 45, 20, 33, 53};
        int LastElement = 10,
//
        LastElementPosition = 0;


        for (int i = GivenArray.length-1; i > 0; i--)
            if (GivenArray[i] == LastElement) {LastElementPosition = i; break;}

        int NewArrayLenght = GivenArray.length-1-LastElementPosition;
        int[] NewArray = new int[NewArrayLenght];

            for (int i = 0; i < NewArrayLenght; i++)
                NewArray[i] = GivenArray[LastElementPosition + i + 1];

        System.out.println(Arrays.toString(NewArray));
    }

}

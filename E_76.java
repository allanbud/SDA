package Exercises;
/*
Write a Java program to test if the first or the last elements of two arrays of integers are same.
The length of the two arrays must be greater than or equal to 2.
 */
public class E_76 {
    public static void main(String[] args)
    {
        //boolean x;
        int[] a1 = {50, -20, 0, 30, 40, 60, 12};
        int[] a2 = {45, 20, 10, 20, 30, 50, 11};

        if (a1[0] == a2[0] || a1[a1.length-1] == a2[a2.length-1])
        System.out.println("Yes"); else  System.out.println("Better Call Soul");
    }
}


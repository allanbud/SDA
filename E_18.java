package Exercises;
/*
Write a Java program to multiply two binary numbers. Go to the editor
Input Data:
Input the first binary number: 10
Input the second binary number: 11

 */
public class E_18 {

    public static String multiplytwo(String first, String second)
    { int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 * b2;
        return Integer.toBinaryString(sum); }


    public static void main(String[] args) {

        System.out.println(multiplytwo("10","11"));
    }


}

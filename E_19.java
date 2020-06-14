package Exercises;
/*
Write a Java program to convert a decimal number to binary number. Go to the editor
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */
public class E_19 {

    public static String multiplytwo(String first)
    {
        int toInt = Integer.parseInt(first);
        return Integer.toBinaryString(toInt); }


    public static void main(String[] args) {

        System.out.println(multiplytwo("5"));
    }


}

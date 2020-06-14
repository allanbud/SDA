package Exercises;
/*

Write a Java program to add two binary numbers.


 */

public class E_17 {

    public static String addtwo(String first, String second)
    { int b1 = Integer.parseInt(first, 2);
    int b2 = Integer.parseInt(second, 2);
    int sum = b1 + b2;
    return Integer.toBinaryString(sum); }


    public static void main(String[] args) {

        System.out.println(addtwo("10","0"));
    }




}

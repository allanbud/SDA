package Exercises;

/*
116. Write a Java program which iterates the integers from 1 to 100.
For multiples of three print "Fizz" instead
of the number and print "Buzz" for the multiples of five.
When number is divided by both three and five, print "fizz buzz".

 */

public class E_116 {

     public static void main(String[] args) {

        for (int i = 1; i < 101; i++)
        System.out.println(FizzBuzzProblem(i));

     }

       static String FizzBuzzProblem(int i) {

            if (i % 15 == 0) return "FizzBuzz";
              else if (i % 3 == 0) return "Fizz";
              else if (i % 15 == 0) return "Buzz";
            else return String.valueOf(i);}
}





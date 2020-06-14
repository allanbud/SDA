package Exercises;
/*
Write a Java program to Compute the sum of the prime numbers till 100.
 */
public class E_66 {

    public static boolean IsPrime(int number)
    {
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }

    public static void main(String[] args)
    {
        int number = 2, sum = 0, i = 0;

//up to 100

while (i < 100) {
    if (IsPrime(number)) {
        sum = sum + number;
        i = i + 1;
    } number++;
}
    System.out.println(sum);
    }
}




package Exercises;

import java.util.Scanner;

public class PrimeNumberMain {

    public static void main(String[] args) {
        long startTime, endTime, timeElapsed;

        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long ReadNum = scan.nextLong();


        PrimeNumber CheckPrimeNumber = new PrimeNumber();

        startTime = System.nanoTime();
            boolean NL = CheckPrimeNumber.NormalLoop(ReadNum);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Normal method says: " + NL);
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println();


        startTime = System.nanoTime();
            boolean NR = CheckPrimeNumber.RecursiveLoop(ReadNum);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Recursive method says: " + NR);
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
    }
    }



package Exercises;


public class PrimeNumber
{

    public boolean NormalLoop(long num) {


        if (num <= 2) return (num == 2) ? true : false;

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        }

    public boolean RecursiveLoop(long num)

    {
        return RecursiveLoopEXE(num, 2);
    }

    private boolean RecursiveLoopEXE(long num, long i)

    {
        if (num <= 2)
            return (num == 2) ? true : false;

        if (num % i == 0)
            return false;

        if (i * i > num)
            return true;

        return RecursiveLoopEXE(num, i + 1);
    }

}
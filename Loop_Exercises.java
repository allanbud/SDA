package Exercises;

public class Loop_Exercises {

    private static void Ex_1() {
        for (int i=1; i <= 10; i++) {
            System.out.println(8 + " x " + i + " = " + (8 * i));
        }
    }

    private static void Ex_2() {
        int n = 100;
        System.out.print("Even Numbers from 1 to 100: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                if (i == 50 || i == 100)  {
                    System.out.println();
                }
                }
            }
        }

    private static void Ex_3() {
        for (int i = 1; i <=5; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print("5");
            }
            System.out.print(", ");
        } System.out.println();
    }

    private static void Ex_4() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i +", ");
        }
        System.out.println();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i +", ");
        }
        System.out.println();
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0)
                System.out.print(i +", ");
        }
        System.out.println();
    }

    private static void Ex_5() {
        int i = 1;
        do {
            System.out.print(i * 3 + ", ");
            i *= 3;
        } while (i * 3 < 100);
        System.out.println();
    }

    private static void Ex_6() {
        int n = 10, a = 0, b = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    private static void Ex_7() {
        int rows = 5, k = 0;

        for(int i = 1; i <= rows; i++, k = 0) {
            for(int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print(i + " ");
                ++k;
            }
            System.out.println();
        }
    }

    private static void Ex_8() {
        int i = 0,
            n = 1;
        PrimeNumber CheckPrimeNumber = new PrimeNumber();
        while (i < 4) {
            if (CheckPrimeNumber.RecursiveLoop(n)) {
                System.out.print(n + " ");
                i++;
            } n++;
        }
        System.out.println();
    }

    private static void Ex_9() {
        int i = 1;
        do {
            System.out.print(i * 4 + ", ");
            i++ ;
        } while (i <= 4);
        System.out.println();
    }

    private static void Ex_10() {
        int i = 1,
    factorial = 1;
        while(i <= 5) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of 5: "+ factorial);
    }


    public static void main(String[] args) {

        Ex_1();
        System.out.println("_________________________________");
        Ex_2();
        System.out.println("_________________________________");
        Ex_3();
        System.out.println("_________________________________");
        Ex_4();
        System.out.println("_________________________________");
        Ex_5();
        System.out.println("_________________________________");
        Ex_6();
        System.out.println("_________________________________");
        Ex_7();
        System.out.println("_________________________________");
        Ex_8();
        System.out.println("_________________________________");
        Ex_9();
        System.out.println("_________________________________");
        Ex_10();
        System.out.println("_________________________________");
    }
}
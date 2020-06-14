package Exercises;

public class Data_Types_Exercises {

    private static void Ex_1()  {
        System.out.println(74+36);
    }

    private static void Ex_2()  {
        System.out.println(50/3 + " remainder " + 50%3);
    }

    private static void Ex_3()  {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    private static void Ex_4()  {
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); //print float
    }

    private static void Ex_5()  {
        System.out.println("Area = " + Math.PI * 7.5 * 7.5 + " Perimeter = " + 2 * Math.PI * 7.5); //print double
    }

    private static void Ex_6()  {
        System.out.println((10+20+30)/3);
    }

    private static void Ex_7()  {
        System.out.println("Area = " + 5.5*8.5 + " Perimeter = " + 2*(5.5*8.5));
    }

    private static void Ex_8()  {
        int a = 5,
            b = 13;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "   " + b);
    }

    private static void Ex_9()  {
        if ( 25 != 39 ) {
            System.out.printf( "%d not equal %d\n", 25, 39 );}
    }

    private static void Ex_10()  {
        int sum = 0,
              n = 133;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
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

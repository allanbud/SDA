package Exercises;
import java.util.Arrays;
public class Arrays_Exercises {

    private static void Ex_1()  {
        int array[] = {1, 7, 3, 10, 9};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println("Output: " + sum);
    }

    private static void Ex_2()  {
        int array[] = new int[]{1, 7, 3, 10, 9};
        int sum = 0;
        for(int i=0; i < array.length ; i++)
            sum += array[i];
        int average = sum / array.length;
        System.out.println("Output : " + average);

    }

    private static void Ex_3() {
        int array[] = {1, 7, 3, 10, 9};

        for (int i : array) {
            if ( i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static void Ex_4() {
        int array[] = {1, 7, 3, 10, 9};
            int maxValue = array[0],
                    minValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                if (array[i] < minValue) {
                    minValue = array[i];
                    }
                }
            }
            System.out.println("Min: " + minValue + " Max: " + maxValue);
        }

    private static void Ex_5() {
        int[] array = {1, 7, 3, 10, 9},
              NewArray = new int[array.length];
        int n = array.length;
            int j = n;
            for (int i = 0; i < n; i++) {
                NewArray[j - 1] = array[i];
                j = j - 1;
            }
        System.out.println("Reverse array : "+Arrays.toString(NewArray));
    }

    private static void Ex_6() {
        int[] array = {1, 7, 3, 10, 9};
        int n = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
                n++;
        }
        System.out.println("Even numbers : " + n + " Odd numbers: " + (array.length-n));
    }

    private static void Ex_7() {
        int[] array = {1, 7, 3, 10, 9},
           NewArray = new int[array.length+1];
        int n = 0,
            pos = 2,
            newV = 4;
        for(int i = 0; i <= array.length-1; i++){
            if (n == pos) {
                NewArray[n] = newV;
                n++;
            }
            NewArray[n] = array[i];
            n++;
        }

        System.out.println("Inserted 4 to pos 2 " + Arrays.toString(NewArray));
    }

    private static void Ex_8() {
        int[] array = {1, 7, 3, 7, 10, 1, 9};

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.print(array[j] + "  ");
                }
            }
        }
    }

    private static void Ex_9() {
        int[] array = {1, 7, 3, 10, 9};
        Arrays.sort(array);

        System.out.println("second largest is " + array[array.length - 2]);
        System.out.println();

    }

    private static void Ex_10() {
        int[] array = {1, 2, 7, 3, 10, 2, 9};
        int n = 4;
        for (int i =  0; i < array.length; i++)
        {
            for (int j  = i+1; j < array.length; j++)
            {
                if(array[i]+array[j] == n)
                {
                    System.out.println(array[i]+"-"+array[j]);
                }
            }
        }
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
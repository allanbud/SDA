package Exercises;

public class E_79 {


    static int[] OriginalArray = {20, 30, 40};

    public static void main(String[] args) {

        for (int i = OriginalArray.length; i != 0; i--) {

            System.out.print(OriginalArray[i-1] + ", ");
        }
    }


}

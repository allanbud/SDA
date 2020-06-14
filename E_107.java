package Exercises;
/*
107. Write a Java program to check if an array of integers contains
three increasing adjacent numbers. Go to the editor
 */
public class E_107 {

    private static int[] OriginalArray = {11, 12, 13, 14, 15, 16, 20, 21, 22, 23};

    public static void main(String[] args) {
        int n = 0;
 // i = 1 because first (11) number is not (10+1)
       for (int i = 1; i < OriginalArray.length - 2; i++) {

           if ((OriginalArray[i] == OriginalArray[i+1] - 1) && (OriginalArray[i] == OriginalArray[i+2] - 2)) {
               n = n + 1;

           }

        }
    if (n > 0) {System.out.println("Yes, the array of integers contains three increasing adjacent numbers. ");
                 System.out.println("There are " + n + " sequences");}

    }


}

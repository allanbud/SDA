package Exercises;

/*Write a Java program to insert an element at a specific position into an array: [1, 7, 3, 10, 9];
        insert 4 at position 2; remember that an array starts from 0
        Output: [1, 7, 4, 3, 10, 9]
*/
import java.util.Arrays;
public class E_7 {

    public String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }


    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};

        int pos = 2;
        int toInsert = 4;
        String str = Arrays.toString(array);


        //System.out.println(addChar);

    }
}



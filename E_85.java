package Exercises;
/*
. Write a Java program to check if a string starts with a specified word. Go to the editor
Sample Data: string1 = "Hello how are you?"
 */
public class E_85 {
    public static void main(String args[]){

// boolean startsWith(String str, index fromIndex)

        String str = "Better Call Saul",
                fromIndex = "Better";

        System.out.println(str.startsWith(fromIndex));


    }
}
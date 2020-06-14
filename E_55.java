package Exercises;
/*
55. Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
Sample Output:

Input seconds: 86399
23:59:59
 */
public class E_55 {

    private static int sec = 86399;


    public static void main(String[] args) {

        int seconds_after = sec % 60;
        int seconds_before = sec / 60;
        int minutes = seconds_before % 60;
        int hours = seconds_before / 60;
        System.out.println( hours + ":" + minutes + ":" + seconds_after);


    }


// 60 3600




}

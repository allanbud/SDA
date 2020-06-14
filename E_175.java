package Exercises;
/*
Write a Java program to delete a specified
node in the middle of a singly linked list. Go to the editor

Sample Singly linked list: 10->20->30->40->50
Delete the fourth node i.e. 40
Result: 10->20->30->50
 */
import java.util.LinkedList;

public class E_175 {

private static int ElementToRemove = 4;

    public static void main(String[] args) {

        LinkedList<String> object = new LinkedList<String>();
        object.addFirst("10");
        object.add("20");
        object.add("30");
        object.add("40");
        object.addLast( "50");

        System.out.println("Original list: " + object);

        object.remove(ElementToRemove - 1);


        System.out.println("After removing " + ElementToRemove + " element the list is: " + object);
    }



}

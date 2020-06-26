import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    private static Scanner in = new Scanner(System.in);

    private static boolean isNumber(String string)  {
// method checks if string can be parsed to Double
        try{
// tries to convert string to Double and returns true if success
            Double.parseDouble(string);
            return true;
// if trows exception catch it and return false because it is not a number
        } catch (NumberFormatException ex){
            return false;
        }

    }

    public static void main(String[] args){

        String str = in.nextLine();

// strings split by spaces
        String[] strings = str.split(" ");

        Stack<Double> stack = new Stack<Double>();

        for (int i = 0; i < strings.length; i++){
//push string number to stack
            if (isNumber(strings[i])){
                stack.push(Double.parseDouble(strings[i]));
            }
            else{
//if string is not number create new double from top of stack
                double tmp1 = stack.pop();
// second double takes next from stack (now its first after previos operation)
// two elements from top of stack converted to two double vars
                double tmp2 = stack.pop();

                switch (strings[i]){
// replace two elements from top of stack with calculation
                    case "+":

                        stack.push(tmp1 + tmp2);

                        break;

                    case "-":
//tmp2 goes first because it was taken from stack after tmp1
                        stack.push(tmp2 - tmp1);

                        break;

                    case "*":

                        stack.push(tmp1 * tmp2);

                        break;

                    case "/":

                        stack.push(tmp2 / tmp1);

                        break;
                }
            }
        }

        if (!stack.empty()) {

            System.out.println(stack.pop());

        } else {

            System.out.println("Error");
        }
    }
}
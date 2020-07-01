import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    private static boolean pass, zero, prefix;

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

    private static String[] reverseStr(String[] string){
        int i = 0;
        int n = 0;
        int len = string.length - 1;
        String[] dest = new String[len+1];

        for (int t = 0; t == len; t++){
            dest[t] = string[t];
        }



        while (!isNumber(string[i])) {
            dest[len] = string[i];
            len--;
            i++;
        }

        for (int j = i; j <= 6; j++){
            dest[n] = string[j];
            n++;
        }

        return dest;
    }


    public static void main(String[] args){


        System.out.println("post or pref?");
        String menu = in.nextLine();
        if (menu.equals("post")) {
            prefix = true;
        }

        System.out.println("please enter what you need to enter");
        String str = in.nextLine();


// strings split by spaces
        String[] strings = str.split(" ");

        if (!prefix) {
            strings = reverseStr(strings);
        }

        Stack<Double> stack = new Stack<Double>();



        for (int i = 0; i < strings.length; i++){
//push string number to stack
            if (isNumber(strings[i])){
                stack.push(Double.parseDouble(strings[i]));
            }
            else {
                if (stack.size() >= 2 && strings.length % 2 != 0) {
                    pass = true;
                    double tmp1 = stack.pop();
// second double takes next from stack (now its first after previos operation)
// two elements from top of stack converted to two double vars

                    double tmp2 = stack.pop();

                    switch (strings[i]) {
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
                            try {
                                double div = (tmp2 / tmp1);
                                stack.push(div);
                                if (div == Double.POSITIVE_INFINITY ||
                                        div == Double.NEGATIVE_INFINITY) {
                                    throw new ArithmeticException();
                                }
                            } catch (ArithmeticException ae) {
                                zero = true;
                                System.out.print(Color.RED_BOLD_BRIGHT);
                                System.out.println("ArithmeticException occured, div by zero!");
                                System.out.print(Color.RESET);
                            }
                            break;

                        default:
// clear stack will result an error
// break loop
                        {
                            stack.clear();
                            i = strings.length;
                        }

                    }
                }
            }
        }

        if (stack.size() == 1 && !zero && pass) {


            System.out.print(Color.BLACK);
            System.out.print(Color.GREEN_BACKGROUND);
            System.out.println(stack.pop());
            System.out.print(Color.RESET);

        } else {
            System.out.print(Color.RED_BOLD);
            System.out.println("Error! Please check if you have entered correct operator and spaces in between");
            System.out.println("Use dot as decimal separator");
            System.out.print(Color.RESET);
        }
    }
}
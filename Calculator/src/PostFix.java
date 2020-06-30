import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    static boolean pass, zero;

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
                                System.out.println("ArithmeticException occured, div by zero!");
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
            System.out.print(Color.RESET);
        }
    }
}
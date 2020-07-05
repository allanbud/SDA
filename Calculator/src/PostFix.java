import java.util.*;

public class PostFix {

    private static boolean pass, zero, prefix;

    private static Scanner in = new Scanner(System.in);


/***********************************************************************************/
    private static boolean isNumber(String string)  {
        try{
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
/************************************************************************************/

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

        for (int j = i; j <= len + i; j++){
            dest[n] = string[j];
            n++;
        }

        return dest;
    }

/******** define an Operation interface which has a single apply method ********/
    public interface Operation {
        double apply(double a, double b);
    }



/***** The method takes two number as input and returns the result. ********/

    public static class Addition implements Operation {
     @Override
        public double apply(double a, double b) {
            return a + b;
    }
}

    public static class Subtraction implements Operation {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    }

    public static class Multiplication implements Operation {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    }

    public static class Division implements Operation {
        @Override
        public double apply(double a, double b) {
            try {
                double div = (a / b);
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
            return a / b;
        }
    }

/****query the factory to get the relevant operation and apply on the source numbers:*****/

public static double calculateUsingFactory(double a, double b, String operator) {
    Operation targetOperation = OperatorFactory
            .getOperation(operator)
            .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
    return targetOperation.apply(a, b);
}






    public static void main(String[] args){

/*
        System.out.println("post or pref?");
        String menu = in.nextLine();
        if (menu.equals("post")) {
            prefix = true;
        }

 */

        System.out.println("please enter what you need to enter");
        String str = in.nextLine();


        String[] strings = str.split(" ");
/*
        if (!prefix) {
            strings = reverseStr(strings);
        }

 */

        Stack<Double> stack = new Stack<Double>();

        for (int i = 0; i < strings.length; i++){


            if (isNumber(strings[i])){
                stack.push(Double.parseDouble(strings[i]));
            }
            else {

                if (stack.size() >= 2 && strings.length % 2 != 0) {
                    pass = true;
                    double tmp1 = stack.pop();
                    double tmp2 = stack.pop();
                    stack.push(calculateUsingFactory(tmp2, tmp1, strings[i]));

/*


                    switch (strings[i]) {

                        case "+":

                            stack.push(tmp1 + tmp2);

                            break;

                        case "-":

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
// if any symbol that is not an operator will result an error
// clean stack is an error automatically
// i = string.length will break the loop
                        {
                            stack.clear();
                            i = strings.length;
                        }


                    }
*/
                }
            }
        }


// final result can exist only if there is only one element in stack left
// if no div by zero has accured
// and if calculation has succesfully passed

        if (stack.size() == 1 && !zero && pass) {


            System.out.print(Color.BLACK);
            System.out.print(Color.GREEN_BACKGROUND);
            System.out.println(stack.pop());
            System.out.print(Color.RESET);

        } else {

// if not general error message appears
// if there was div by zero then before general error message
// div by zero error will be printed too
// examples of errors:
// 2 2,5 +
// 2 2.5+


            System.out.print(Color.RED_BOLD);
            System.out.println("Error! Please check if you have entered correct operator and spaces in between");
            System.out.println("Use dot as decimal separator");
            System.out.print(Color.RESET);
        }
    }
}
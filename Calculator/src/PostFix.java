import java.util.*;

public class PostFix {

    
    private static boolean doneWithCalculations, DivByZero;

    private static Scanner in = new Scanner(System.in);


/*****************checks if the symbol entered by user in a number (double)*********************/
    private static boolean isNumber(String string)  {
        try{
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }


/******** define an Operation interface which has a single apply method ********/
    public interface Operation {
        double apply(double a, double b);
    }



/***** The method takes two numbers as input and returns the result. ********/

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
                DivByZero = true;
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
            .orElseThrow(() -> new IllegalArgumentException(""));
    return targetOperation.apply(a, b);
}


    public static void main(String[] args){

        System.out.println("Please enter Postfix calculator string,");
        System.out.println("use spaces to separate numbers and operators:");
        String str = in.nextLine();


        String[] strings = str.split(" ");


        Stack<Double> stack = new Stack<Double>();

        for (int i = 0; i < strings.length; i++){


            if (isNumber(strings[i])){
                stack.push(Double.parseDouble(strings[i]));
            }
            else {

                if (stack.size() >= 2 && strings.length % 2 != 0) {
                    doneWithCalculations = true;
                    double b = stack.pop();
                    double a = stack.pop();

                    try {
                    stack.push(calculateUsingFactory(a, b, strings[i]));}
                    catch (IllegalArgumentException e) {
/***** Clearing stack will result displaying error message ***********************/                        
                        stack.clear();
                        i = strings.length;
                    }
                }
            }
        }


// final result can exist only if there is only one element in stack left
// if no div by DivByZero has accured
// and if calculation has succesfully passed

        if (stack.size() == 1 && !DivByZero && doneWithCalculations) {


            System.out.print(Color.BLACK);
            System.out.print(Color.GREEN_BACKGROUND);
            System.out.println(stack.pop());
            System.out.print(Color.RESET);

        } else {


// examples of errors:
// 2 2,5 +
// 2 2.5+
// 1 2 3 +
// 1 2 3 + + +
// 1 2 3 ++


            System.out.print(Color.RED_BOLD);
            System.out.println("Error! Please check if you have entered correct operator and spaces in between");
            System.out.println("Use dot as decimal separator");
            System.out.print(Color.RESET);
        }
    }
}
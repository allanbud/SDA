package Exercises;

/*
57. Write a Java program to accepts an integer and count the factors of the number. Go to the editor
Sample Output:

Input an integer: 25
3
 */



public class E_57 {

        public static String allfactors (int n, boolean count)
        {
            String result = "";
            int m = 0;
            for (int i = 1; i <= n; i++)
            {
                if(0 == (n % i)) {
                    //self expanding String
                    result = result + i + " ";
                    m++;
                }
            }
            if (count)
            return result;
            else
                return String.valueOf(m);
        }

    public static void main(String[] args)
    {
        System.out.println(allfactors(1024, false));
    }
}




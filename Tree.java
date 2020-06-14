package Exercises;

public class Tree {


        public static void main(String[] args) {


            printTriangle(5, false);
            printTriangle(8, false);

            
            printTriangle(20, true);

            }


        public static void printTriangle(int rows, boolean rectangle) {
             // Inverted rows
            int row_Inv = rows;

            for (int row = 1; row <= rows; row++) {
                for (int column = rows - 1; column >= row; column--) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * row - 1); k++) {
                    if ((row == rows) || ((k == 1) || (k == (2 * row - 1)))) {
                        System.out.print("*");

                    if (rectangle) {
                        if (k == (2 * row - 1)) {
                            for (int g = (2 * row_Inv - 2); g >= 1; g--) {
                                if ((row_Inv == rows) || ((g == 1) || (g == (2 * row_Inv - 1)))) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                    }

                    } else {
                        System.out.print(" ");
                    }
                }
               System.out.println();
                if (rectangle) {
                    row_Inv--;
                }
            }
        }
}

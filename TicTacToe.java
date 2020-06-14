package Exercises;
import java.util.Scanner;

public class TicTacToe {

    // Edge 3 and Field size 3*3
    private static int fieldsize = 9,
                            edge = 3;

    // Field as an array of String
    //no need to make [][] because we can loop 1-3 3 times
    private static String[] field = new String[fieldsize];
    
    // Current player can be 1 or 2
    private static int currentplayer;

    //input check, should be within the field (1-9)
    //and not containing char X or 0
    private static boolean isValidInput(int input) {
        if ((input >= fieldsize) || (input < 0)) return false;

        //sends input to getX and check if 0 or X not there
        switch (getX(input)) {
            case 'O':
            case 'X':
                return false;
        }

        return true;
    }

    // set current player number
    //player will be 2 if not 1
    //and will be 1 if any other
    private static void nextPlayer() {
        currentplayer = (int) (currentplayer == 1 ? 2 : 1);
    }

    // check for winning combination and if any move possible
    private static boolean GameOver() {
        int i, j;
        boolean row , col;

        // Checking row and col win condition
        for (i = 0; i < edge; i++) {
            row = true;
            col = true;

            for (j = 0; j < edge-1; j++) {
                //row remains true if both nearby chars are equal
                //https://www.tutorialspoint.com/java/java_basic_operators.htm
                row = row & (getXY(i,j).charAt(0) == getXY(i,j+1).charAt(0));

                col &= (getXY(j,i).charAt(0) == getXY(j+1,i).charAt(0));
            }

            //if till this point row (col) has not changed to false we have got a winner!
            if (col || row) {
                System.out.println("Player " + currentplayer + " has won!");
                return true;
            }
        }

        //Diagonal win condition
        row = true;
        col = true;

        for (i=0; i<edge-1; i++) {
            row &= (getXY(i,i).charAt(0) == getXY(i+1,i+1).charAt(0));
            col &= (getXY(i, edge-i-1).charAt(0) == getXY(i+1, edge-i-2).charAt(0));
        }

        if (col || row) {
            System.out.println("Player " + currentplayer + " has won!");
            return true;
        }

        // Any move possible?
        for (i = 0; i < fieldsize; i++) {
            switch (getX(i)) {
                case 'O':
                case 'X':
                    break;
                default:
                    return false;
            }
        }
        if (fieldsize <= i) {
            System.out.println("Draw!");
            return true;
        }

        // lets continue the game
        return false;
    }

   // returns value at the x,y coordinate
    private static String getXY(int x, int y) {
        return field[x * edge + y];
    }

   // returns char value at field[x] position
    private static char getX(int x) {
        return field[x].charAt(0);
    }

    // replace chosen field number with X or 0
    private static void insertX(int x) {
        field[x] = currentplayer == 1 ? "X" : "O";
    }

    // print the field array each line edge long
    private static void printfield() {
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                //make spaces between columns
                System.out.printf("%4s", getXY(i, j));
            }
            System.out.print("\n" + "\n");
        }
    }




    public static void main(String[] args)  {
        int temp = 0;
        Scanner scanner = new Scanner(System.in);

        // filling in the playfield
        for (int i = 0; i < fieldsize; i++) {
            field[i] = Integer.toString(i + 1);
        }

        // Play till GameOver
        while (!GameOver()) {
            nextPlayer();
            //loop until break
            while (true) {
                System.out.println("Player " + currentplayer + " move");
                System.out.println();


                printfield();

                // if current player is 1 "X" is printed, else "0" is printed
                System.out.print("Type the field number where your " + (currentplayer == 1 ? "X" : "0") + " should be: ");


                if (scanner.hasNextInt()) {
                    // true if and only if this scanner's next token is a valid int value
                    // if true then input from scanner (-1)
                    temp = scanner.nextInt() - 1;

                    //if input is OK break the loop
                    //else give a next try
                    if (isValidInput(temp)) {
                        break;
                    }
                }

                System.out.println("Incorrect input, please try again!");
                scanner.next();
            }

            //https://www.w3schools.com/java/java_try_catch.asp
            //error shooting
            try {
                //inserting X or 0
                insertX(temp);
            } catch (Exception e) {
                System.out.println("Crazy error handled by try/catch");
            }
        }
        printfield();
    }

}
package Exercises;

/*
 Write a Java program to find all the start indices of a given
 string's anagrams in another given string
 */

public class E_188 {

    static String OriginalString = "zyxwyxyxzwxyz", ShortString = "xyz";

    private static int[] ShortArray = new int[ShortString.length()];
    private static int[] OriginalArray = new int[OriginalString.length()];

    public static void main(String[] args) {
        OriginalString = OriginalString.replaceAll("x", "1");
        OriginalString = OriginalString.replaceAll("y", "2");
        OriginalString = OriginalString.replaceAll("z", "3");
        OriginalString = OriginalString.replaceAll("w", "4");

        ShortString = ShortString.replaceAll("x", "1");
        ShortString = ShortString.replaceAll("y", "2");
        ShortString = ShortString.replaceAll("z", "3");

        char[] chO = OriginalString.toCharArray();
        for (int i = 0; i < OriginalString.length(); i++)
        OriginalArray[i] = Integer.parseInt(String.valueOf(chO[i]));

        char[] chS = ShortString.toCharArray();
        for (int i = 0; i < ShortString.length(); i++)
        ShortArray[i] = Integer.parseInt(String.valueOf(chS[i]));

        //System.out.println(OriginalString);
        //System.out.println(ShortString);

        //System.out.println(Arrays.toString(OriginalArray));
        //System.out.println(Arrays.toString(ShortArray));


        for (int i = 0; i < OriginalArray.length-2; i++)

            if (
                    ((E_131.check(ShortArray, OriginalArray[i])) &&
                    (E_131.check(ShortArray, OriginalArray[i + 1])) &&
                    (E_131.check(ShortArray, OriginalArray[i + 2])))
                                            &&
                    ( (OriginalArray[i] != OriginalArray[i + 1]) && (OriginalArray[i] != OriginalArray[i + 2]) )
            )

            {
                char p = 'w', pp = 'w', ppp = 'w';
                if (OriginalArray[i] == 3)  p = 'z';
                else if (OriginalArray[i] == 2)  p = 'y';
                else if (OriginalArray[i] == 1)  p = 'x';

                if (OriginalArray[i+1] == 3)  pp = 'z';
                else if (OriginalArray[i+1] == 2)  pp = 'y';
                else if (OriginalArray[i+1] == 1)  pp = 'x';

                if (OriginalArray[i+2] == 3)  ppp = 'z';
                else if (OriginalArray[i+2] == 2)  ppp = 'y';
                else if (OriginalArray[i+2] == 1)  ppp = 'x';

                System.out.print(i + " " + p + " " + pp + " " + ppp);
                System.out.println("");

            }
    }
}

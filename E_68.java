package Exercises;
/*
 Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above. Go to the editor
Sample Output:

3.03.03.03.0
 */
public class E_68 {
    public static void main(String[] args)
    {
        String S = "Better Call Saul";
/*
The substring(int beginIndex, int endIndex) method of the String class.
It returns a new string that is a substring of this string. The substring begins at the specified beginIndex
and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
 */
        S = S.substring(S.length() - 3);
        System.out.println(S+"'"+ S + "'"+S);
    }
}

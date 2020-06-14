package Exercises;
/*
 Write a Java program to remove duplicates from a sorted linked list. Go to the editor
Original List with duplicate elements:
12->12->13->14->15->15->16->17->17
After removing duplicates from the said list:
12->13->14->15->16->17
 */
public class E_135 {

    public static int n = 1;
    public static String GivenList = "12->12->13->14->15->15->16->17->17";

    public static void main(String[] args) {
                 System.out.print(SortedGivenList(GivenList));
    }

    static char[] SortedGivenList(String GivenList){

        char MakingLists[] = new char[GivenList.length()];
        MakingLists[0] = '1';
        for (int i = 1; i < MakingLists.length; i = i + 4){
                    if (MakingLists[n] != GivenList.charAt(i)) {
                        n = n + 4;
                        MakingLists[n] = GivenList.charAt(i);
                        MakingLists[n+1] = '-'; MakingLists[n+2] = '>'; MakingLists[n+3] = '1';
                    }
        }
    MakingLists[n+1] = 0; MakingLists[n+2] = 0; MakingLists[n+3] = 0;
    return MakingLists;
    }
}

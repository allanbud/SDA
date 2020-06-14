package Exercises;

public class String_Exerccises {

    private static void Ex_1()  {
        System.out.println("Hello");
        System.out.println("Allan");
    }

    private static void Ex_2() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    private static void Ex_3() {
        String t = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(t.toLowerCase());
    }

    private static void Ex_4() {
        StringBuilder rev = new StringBuilder();
        rev.append("avaJ");
        System.out.println(rev.reverse());
    }

    private static void Ex_5() {
        String t = "Programmer";
        System.out.println(t.substring(0,t.length()/2));
    }

    private static void Ex_6() {
        String t = "Java",
              tt = "Fundamentals";
        System.out.println(t.substring(1) + tt.substring(1));
    }

    private static void Ex_7() {
        String t = "This is Java!";
        System.out.println(t.length() + " characters");
    }

    private static void Ex_8() {
        String t = "This is a comparison",
              tt = "THIS is A Comparison";
        int c = t.compareToIgnoreCase(tt);
        boolean b = (c == 0) ? true: false;
        System.out.println(b);
    }

    private static void Ex_9() {
        String t = "Java exercises",
              tt = "ses";
        boolean b = t.endsWith(tt);
        System.out.println(b);
    }

    private static void Ex_10() {
        String t = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        char[] c = t.toCharArray();
        int l = 0,
            s = 0,
            n = 0,
            o = 0;
        for(int i = 0; i < t.length(); i++){
            if(Character.isLetter(c[i])){
                l ++ ;
            }
            else if(Character.isDigit(c[i])){
                n ++ ;
            }
            else if(Character.isSpaceChar(c[i])){
                s ++ ;
            }
            else{
                o ++;
            }
        }
        System.out.println("Letters: " + l + "; Spaces: " + s + "; Numbers: " + n + "; Other: " + o);
    }

    public static void main(String[] args) {

        Ex_1();
        System.out.println("_________________________________");
        Ex_2();
        System.out.println("_________________________________");
        Ex_3();
        System.out.println("_________________________________");
        Ex_4();
        System.out.println("_________________________________");
        Ex_5();
        System.out.println("_________________________________");
        Ex_6();
        System.out.println("_________________________________");
        Ex_7();
        System.out.println("_________________________________");
        Ex_8();
        System.out.println("_________________________________");
        Ex_9();
        System.out.println("_________________________________");
        Ex_10();
        System.out.println("_________________________________");
    }

}

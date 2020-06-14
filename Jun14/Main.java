package Jun14;

public class Main {

    public static void main(String[] args) {

        String desiredFlag = "ESTONIA";

        Flags flags = Flags.ESTONIA;

        Flags.IRAN.getColour();

        switch (flags) {
            case ESTONIA:
                System.out.println("Estonia");
                break;
            case RUSSIA:
                System.out.println("Russia");

        }

//        for (Flags flags : Flags.values()){
//            System.out.println(flags.colour);
//        }


        

    }
}

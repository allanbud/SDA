package Jun14;

public enum Flags {
    ESTONIA("red"),
    FINLAND("blue"),
    RUSSIA("green"),
    SWEDEN("white"),
    IRAN("grey"),
    USA("black");

    String colour;

    Flags(String colour) {
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }
}

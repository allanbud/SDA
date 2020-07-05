package SDA.allan.Factory;

class FactoryPattern {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getInstance("laptop");
        Computer miniPad = ComputerFactory.getInstance("minipad");
        Computer desktop = ComputerFactory.getInstance("desktop");;
    }
    public static Computer getComputer(String comptuerType) {
        return ComputerFactory.getInstance(comptuerType);
    }
}
//Abstracting out the logic of creation of the object.
//This solves two problems: 1) Maintainability [you don't have to WET code]; 2) Extensibility
class ComputerFactory {
    public static Computer getInstance(String computerType) {
        if(computerType.equalsIgnoreCase("desktop")) {
            return new DesktopPC();
        } else if (computerType.equalsIgnoreCase("laptop")) {
            return new Laptop();
        } else if (computerType.equalsIgnoreCase("minipad")) {
            return new MiniPad();
        } else {
            return null;
        }
    }
}
interface Computer {
    void turnOn();
}
class DesktopPC implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turning on Desktop");
    }
}
class Laptop implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turning on Laptop");
    }
}
class MiniPad implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turning on MiniPad");
    }
}
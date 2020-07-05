package SDA.allan.singleton;
public class SingleTon {
    public static void main(String[] args) {
        SingleObject obj1 = SingleObject.getInstance();
        SingleObject obj2 = SingleObject.getInstance();
        SingleObject obj3 = SingleObject.getInstance();
        obj3.setDescription("Another description");
        SingleObject completelyDifferentObject = SingleObject.getInstance();
        completelyDifferentObject.printDescription();
        SingleObject objectFromAnotherPlanet = SingleObject.getInstance(); //
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(objectFromAnotherPlanet);
        System.out.println(completelyDifferentObject);
    }
}
final class SingleObject {
    private long id;
    private String description;
    private static SingleObject singleObject = new SingleObject();
    public SingleObject() {
    }
    public static SingleObject getInstance() {
        return singleObject;
    }
    public void printDescription() {
        System.out.println("Description is "+this.description);
    }
    public void setDescription(String description) {
        this.description=description;
    }
}
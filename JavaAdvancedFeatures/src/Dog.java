public class Dog {

    private String name, gender, race;
    private int age, weight;



    public Dog(String name, String gender, String race, int age, int weight) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        Dog dog = new Dog("default name","default gender", "default race",1, 1);
        //should it be:
        this.gender = gender;
        this.race = race;
        //  or this:
        dog.gender = gender;
        dog.race = race;

    }



    public static void main(String[] args) {

    }






}

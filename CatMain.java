package Exercises;

public class CatMain{

public static void main(String[] args) {

    Cat barsik = new Cat("Барсик", 5, 4);
    String barsikName = barsik.getName();
    int barsikAge = barsik.getAge();
    int barsikWeight = barsik.getWeight();

    System.out.println("Имя кота: " + barsikName);
    System.out.println("Возраст кота: " + barsikAge);
    System.out.println("Вес кота: " + barsikWeight);

                    barsik.setName("Василий");
                    System.out.println("Новое имя кота — " + barsik.getName());
}
}

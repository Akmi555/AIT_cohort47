package homework_16;
/*
@date 06.06.2024
@author Sergey Bugaienko
*/

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 50);

        System.out.println(dog.toString());
        dog.getBarrier(120);

        dog.getBarrier(55);

        Dog dog1 = new Dog("Feller", 45);
        // Может взять 86?

        dog1.getBarrier(86);



    }
}

package mirea.pr2;

import java.util.ArrayList;

public class Dog {
    private String name;
    private int age;

    public Dog(String name) {
        this.name = name;
        this.age = 5;
    }

    public Dog(int age) {
        this.age = age;
        this.name = null;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static int transferAge(int age) {
        return age*7;
    }
}

class DogFilya {
    ArrayList<Dog> dogs = new ArrayList<>();
    public void addDog (Dog dog) {
        dogs.add(dog);
    }
}

package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
        Flyable penguin = new Bird();
        Bird penguin2 = new Bird();
        Walkable cat = new Cat();
        Swimable fish = new Fish();
        Runnable dog = new Dog();
        Runnable man = new Man();

        penguin.fly();
        System.out.println(penguin2.maxRunDistance());
        cat.walk();
        fish.swim();
        dog.run();
        System.out.println(dog.maxRunDistance());
        man.run();
        System.out.println(man.maxRunDistance());

    }
}

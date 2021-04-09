package com.animal.demo;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Wooof");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("meo");
        Dog dog1 = new Dog("dog");
        dog.greets();
        dog1.greets(dog);
    }
}

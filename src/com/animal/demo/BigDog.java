package com.animal.demo;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Wooow");
    }
    public void greets(Dog another){
        System.out.println("Woooooow");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooooow");
    }

    public static void main(String[] args) {
        BigDog bigdog = new BigDog("dog");
        BigDog bigdog1 = new BigDog("dog1");
        bigdog.greets();
        bigdog1.greets();
        bigdog.greets(bigdog1);
        bigdog1.greets(bigdog1);
    }
}

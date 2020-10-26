package test.java.main.oop.base;

import test.java.main.oop.kolobok.Wolf;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        //wolf.eat(girl);
        petya.kill(wolf);
    }
}
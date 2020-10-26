package test.java.main.oop.polymorphism;

import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String queston = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Yes");
                break;
            case 1:
                System.out.println("No");
                break;
            default:
                System.out.println("Maybe");
                break;
        }
    }
}

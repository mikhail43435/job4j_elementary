package ru.job4j.oop.base;

public class Cat {

    private String food;
    private String name;

    public static void main(String[] args) {
        //Cat peppy = new Cat();
        //Cat sparky = new Cat();
        //String say = peppy.sound();
        //System.out.println("Peppy says " + say);
        System.out.println("There are gav's name and food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Timosha");
        gav.show();
        System.out.println("There are black's name and food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Alfred");
        black.show();
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

}

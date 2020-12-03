package ru.job4j.oop.base;

public class Jukebox {
    public void music(int position) {
        String song;
        if (position == 1) {
            song = "Пусть бегут неуклюже";
        } else if (position == 2) {
            song = "Спокойной ночи";
        } else {
            song = "Песня не найдена";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox music = new Jukebox();
        music.music(1);
        music.music(2);
        music.music(3);
    }
}

package test.java.main.oop.polymorphism;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("На столе 11 спичек. Игроки тянут от 1 до 3 спичек по очереди");
        int matchesLeft = 11;
        boolean firstPlayerTurn = true;
        while (matchesLeft > 0) {
            System.out.println("Сейчас на столе " + matchesLeft + " спичек");
            if (firstPlayerTurn) {
                System.out.println("=== Первый игрок забирает спички. Введите количество спичек:");
            } else {
                System.out.println("====== Второй игрок забирает спички. Введите количество спичек:");
            }
            int number = Integer.valueOf(input.nextLine());
            if ((number > 0) && (number <= 3) && ((matchesLeft - number) >= 0)) {
                if ((matchesLeft - number) > 0) {
                    firstPlayerTurn = !firstPlayerTurn;
                }
                matchesLeft = matchesLeft - number;
            } else {
                System.out.println("Введено некорректное значение! Повторите ввод!");
            }
        }
        System.out.println("Выграл " + (firstPlayerTurn ? "первый" : "второй") + " игрок!");
    }
}

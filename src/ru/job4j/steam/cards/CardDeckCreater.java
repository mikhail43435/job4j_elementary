package ru.job4j.steam.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardDeckCreater {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards = Stream.of(Suit.values()).flatMap(e -> Stream.of(Value.values())
                        .map(c -> (new Card(e, c))))
                .collect(Collectors.toList());

        cards.forEach(System.out::println);
    }

}
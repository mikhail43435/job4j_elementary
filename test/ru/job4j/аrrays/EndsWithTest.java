package ru.job4j.аrrays;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void whenOneSymbol() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void when5Symbols() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'r', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
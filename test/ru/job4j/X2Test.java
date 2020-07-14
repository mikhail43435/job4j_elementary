package ru.job4j;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void OtherTests() {
        int a, b, c, x;
        int expected;

        /* Входные параметры 1 */
        a = 1; b = 1; c = 1; x = 1;
        expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));

        /* Входные параметры 2 */
        a = 0; b = 1; c = 1; x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));

        /* Входные параметры 3 */
        a = 1; b = 1; c = 0; x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));

        /* Входные параметры 4 */
        a = 1; b = 1; c = 1; x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));


    }
}
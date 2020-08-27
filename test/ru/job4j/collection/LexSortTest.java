package ru.job4j.collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.Arrays;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum1and2and3() {
        String[] input = {
                "3. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "3. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum1x1x20and1x10x5and1x10x4() {
        String[] input = {
                "1.1.20. Task.",
                "1.10.5. Task.",
                "1.10.4. Task."
        };
        String[] out = {
                "1.1.20. Task.",
                "1.10.4. Task.",
                "1.10.5. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum1andNulland3() {
        String[] input = {
                "3. Task.",
                "",
                "2. Task."
        };
        String[] out = {
                "",
                "2. Task.",
                "3. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}
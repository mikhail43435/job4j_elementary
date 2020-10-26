package test.java.main.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2ThenEqual() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To3ThenEqual() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To3Then2Equal() {
        int result = Max.max(2, 2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To3Then1() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To3Then2() {
        int result = Max.max(3, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(3, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To3ThenTwoEquals() {
        int result = Max.max(1, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To4ThenEqual() {
        int result = Max.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To4Then1() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To4Then2() {
        int result = Max.max(3, 4, 1, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To4Then3() {
        int result = Max.max(3, 2, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To4ThenTwoEquals() {
        int result = Max.max(1, 2, 2, 1);
        assertThat(result, is(2));
    }



}
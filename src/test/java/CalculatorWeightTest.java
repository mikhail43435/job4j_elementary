import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import test.java.main.condition.CalculatorWeight;

import static org.junit.Assert.*;
public class CalculatorWeightTest {

    @Test
    public void manWeight() {

        short param1 = 187;
        double expected = 100.05;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double rsl = CalculatorWeight.manWeight(param1);
        /* сравнение полученного значения с ожидаемым */
        assertEquals(rsl, expected, 0.01);
            }

    @Test
    public void womanWeight() {

        short param1 = 187;
        double expected = 88.55;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double rsl = CalculatorWeight.womanWeight(param1);
        /* сравнение полученного значения с ожидаемым */
        assertEquals(rsl, expected, 0.01);
    }
}

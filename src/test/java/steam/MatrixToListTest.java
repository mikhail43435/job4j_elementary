package test.java.main.steam;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void test1() {
        Integer[][] matrix = { {21, 32}, {664, 234}, {4324, 633}};
        List<Integer> checkList = Arrays.asList(21, 32, 664, 234, 4324, 633);
        assertEquals(checkList, MatrixToList.matrixToList(matrix));
    }
}
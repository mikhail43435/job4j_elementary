package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (!isInRange(x1) || !isInRange(y1) || !isInRange(x2) || !isInRange(y2)) {
            return 0;
        }
        int wayX = Math.abs(x1 - x2);
        int wayY = Math.abs(y1 - y2);
        return wayX == wayY ? wayX : 0;
    }

    private static boolean isInRange(int value) {
        return (0 <= value) && (value <= 7);
    }
}

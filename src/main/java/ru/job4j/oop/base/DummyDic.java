package test.java.main.oop.base;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic string = new DummyDic();
        System.out.println(string.engToRus("word"));
    }
}

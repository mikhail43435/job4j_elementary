package test.java.main.cycles;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double amountLeft = amount;
        while (amountLeft >= 0) {
            amountLeft = (double) amountLeft * (1 + percent / 100) - (double) salary;
            year++;
        }
        System.out.println("Вам понадобится " + year + " лет для погашения ипотеки.");
        return year;
    }
}



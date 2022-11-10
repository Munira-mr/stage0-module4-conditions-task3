package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month % 2 == 0) {
            System.out.println("30 days");
        } else if (month % 2 != 0 || month == 7) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days");
        } else {
            System.out.println("wrong number!");
        }
    }
}

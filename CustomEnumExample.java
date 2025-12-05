enum DayOfWeek {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", true);

    private String russianName;
    private boolean isWeekend;

    DayOfWeek(String russianName, boolean isWeekend) {
        this.russianName = russianName;
        this.isWeekend = isWeekend;
    }

    public String getRussianName() {
        return russianName;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    // Дополнительный метод: следующий день
    public DayOfWeek nextDay() {
        return values()[(ordinal() + 1) % values().length];
    }
}

public class CustomEnumExample {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;
        System.out.println(day.getRussianName());
        System.out.println(day.isWeekend());
        System.out.println(day.nextDay());
    }
}
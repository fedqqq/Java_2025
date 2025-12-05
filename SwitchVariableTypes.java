public class SwitchVariableTypes {
    public static void main(String[] args) {
        System.out.println("=== ТИПЫ ПЕРЕМЕННЫХ В SWITCH ===\n");
        
        // 1. ЦЕЛОЧИСЛЕННЫЕ ТИПЫ
        System.out.println("1. Целочисленные типы:");
        
        // byte
        byte byteValue = 2;
        System.out.print("   byte: ");
        switch (byteValue) {
            case 1: System.out.println("один"); break;
            case 2: System.out.println("два"); break;
            default: System.out.println("другое");
        }
        
        // short
        short shortValue = 100;
        System.out.print("   short: ");
        switch (shortValue) {
            case 100: System.out.println("сто"); break;
            case 200: System.out.println("двести"); break;
            default: System.out.println("другое");
        }
        
        // int
        int intValue = 3;
        System.out.print("   int: ");
        switch (intValue) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            default: System.out.println("другое");
        }
        
        // char
        char charValue = 'A';
        System.out.print("   char: ");
        switch (charValue) {
            case 'A': System.out.println("первая буква"); break;
            case 'B': System.out.println("вторая буква"); break;
            default: System.out.println("другая буква");
        }
        
        // 2. КЛАССЫ-ОБЕРТКИ (с автоупаковкой)
        System.out.println("\n2. Классы-обертки (автоупаковка):");
        
        Integer integerValue = 10;
        System.out.print("   Integer: ");
        switch (integerValue) {
            case 10: System.out.println("десять"); break;
            case 20: System.out.println("двадцать"); break;
            default: System.out.println("другое");
        }
        
        Character characterValue = 'X';
        System.out.print("   Character: ");
        switch (characterValue) {
            case 'X': System.out.println("икс"); break;
            case 'Y': System.out.println("игрек"); break;
            default: System.out.println("другое");
        }
        
        Byte byteWrapper = 5;
        System.out.print("   Byte: ");
        switch (byteWrapper) {
            case 5: System.out.println("пять"); break;
            case 10: System.out.println("десять"); break;
            default: System.out.println("другое");
        }
        
        // 3. ENUM (перечисления)
        System.out.println("\n3. Enum (перечисления):");
        
        Day day = Day.WEDNESDAY;
        System.out.print("   Day enum: ");
        switch (day) {
            case MONDAY: System.out.println("понедельник"); break;
            case TUESDAY: System.out.println("вторник"); break;
            case WEDNESDAY: System.out.println("среда"); break;
            case THURSDAY: System.out.println("четверг"); break;
            case FRIDAY: System.out.println("пятница"); break;
            case SATURDAY: System.out.println("суббота"); break;
            case SUNDAY: System.out.println("воскресенье"); break;
        }
        
        // 4. STRING (Java 7+)
        System.out.println("\n4. String (Java 7+):");
        
        String stringValue = "красный";
        System.out.print("   String: ");
        switch (stringValue) {
            case "красный": System.out.println("red"); break;
            case "зеленый": System.out.println("green"); break;
            case "синий": System.out.println("blue"); break;
            default: System.out.println("unknown");
        }
        
        // 5. VAR (Java 10+) - если тип выводится как допустимый
        System.out.println("\n5. Var (Java 10+):");
        
        var varValue = 42; // тип выводится как int
        System.out.print("   var (int): ");
        switch (varValue) {
            case 42: System.out.println("ответ на все вопросы"); break;
            case 100: System.out.println("сто"); break;
            default: System.out.println("другое");
        }
        
        var varString = "hello"; // тип выводится как String
        System.out.print("   var (String): ");
        switch (varString) {
            case "hello": System.out.println("привет"); break;
            case "world": System.out.println("мир"); break;
            default: System.out.println("другое");
        }
        
        // 6. SWITCH EXPRESSIONS (Java 14+)
        System.out.println("\n6. Switch expressions (Java 14+):");
        
        int number = 2;
        String result = switch (number) {
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            default -> "много";
        };
        System.out.println("   Switch expression: " + result);
        
        // 7. НЕДОПУСТИМЫЕ ТИПЫ (закомментированы)
        System.out.println("\n7. НЕдопустимые типы (ошибка компиляции):");
        
        /*
        // long - НЕ допускается
        long longValue = 100L;
        switch (longValue) { // ОШИБКА
            case 100L: break;
        }
        
        // float/double - НЕ допускаются
        float floatValue = 1.5f;
        switch (floatValue) { // ОШИБКА
            case 1.5f: break;
        }
        
        // boolean - НЕ допускается
        boolean boolValue = true;
        switch (boolValue) { // ОШИБКА
            case true: break;
        }
        
        // Массивы - НЕ допускаются
        int[] array = {1, 2, 3};
        switch (array) { // ОШИБКА
            case array: break;
        }
        
        // Объекты произвольных классов - НЕ допускаются
        Object obj = new Object();
        switch (obj) { // ОШИБКА
            case obj: break;
        }
        */
        
        System.out.println("   long, float, double, boolean, массивы, объекты - НЕ допустимы");
        
        // 8. NULL в switch
        System.out.println("\n8. Обработка null в switch:");
        
        String nullableString = null;
        try {
            switch (nullableString) { // NullPointerException
                case "test": System.out.println("test"); break;
                default: System.out.println("default");
            }
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException при switch с null");
        }
    }
    
    // Enum для демонстрации
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
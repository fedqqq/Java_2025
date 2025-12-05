public class NullPointerUnboxingExample {
    public static void main(String[] args) {
        System.out.println("=== ПРИМЕРЫ NullPointerException ПРИ АВТОРАСПАКОВКЕ ===\n");
        
        // 1. ПРЯМАЯ АВТОРАСПАКОВКА NULL
        System.out.println("1. Прямая автораспаковка null:");
        Integer nullInteger = null;
        try {
            int primitiveInt = nullInteger; 
            System.out.println("   Успешно: " + primitiveInt);
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException: нельзя распаковать null в int");
        }
        
        // 2. АВТОРАСПАКОВКА В АРИФМЕТИЧЕСКИХ ОПЕРАЦИЯХ
        System.out.println("\n2. Автораспаковка в арифметических операциях:");
        Integer a = null;
        Integer b = 10;
        try {
            int sum = a + b; 
            System.out.println("   Сумма: " + sum);
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException: null + 10");
        }
        
        // 3. АВТОРАСПАКОВКА В УСЛОВНЫХ ВЫРАЖЕНИЯХ
        System.out.println("\n3. Автораспаковка в условных выражениях:");
        Boolean nullBoolean = null;
        try {
            if (nullBoolean) {
                System.out.println("   true");
            }
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException: if(nullBoolean)");
        }
        
        // 4. АВТОРАСПАКОВКА ПРИ ВЫЗОВЕ МЕТОДА, ЖДУЩЕГО ПРИМИТИВ
        System.out.println("\n4. Автораспаковка при вызове метода:");
        Integer nullValue = null;
        try {
            printInt(nullValue); 
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException в методе printInt()");
        }
        
        // 5. АВТОРАСПАКОВКА В ЦИКЛЕ
        System.out.println("\n5. Автораспаковка в цикле:");
        Integer start = null;
        try {
            for (int i = start; i < 5; i++) { 
                System.out.println("   " + i);
            }
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException в инициализации цикла");
        }
        
        // 6. АВТОРАСПАКОВКА ПРИ СРАВНЕНИИ
        System.out.println("\n6. Автораспаковка при сравнении:");
        Integer x = null;
        try {
            boolean result = (x == 5); 
            System.out.println("   Результат: " + result);
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException при сравнении null == 5");
        }
        
        // 7. АВТОРАСПАКОВКА В SWITCH (до Java 7)
        System.out.println("\n7. Автораспаковка в switch:");
        Integer choice = null;
        try {
            switch (choice) { 
                case 1: System.out.println("   Один"); break;
                default: System.out.println("   Другое");
            }
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException в switch");
        }
        
        // 8. СМЕШАННЫЕ ОПЕРАЦИИ
        System.out.println("\n8. Смешанные операции:");
        Integer num1 = null;
        Integer num2 = 20;
        try {
            double result = num1 * 1.5 + num2; 
            System.out.println("   Результат: " + result);
        } catch (NullPointerException e) {
            System.out.println("   NullPointerException в смешанном выражении");
        }
        
        // 9. КОГДА NPE НЕ ВОЗНИКАЕТ (для сравнения)
        System.out.println("\n9. Когда NPE НЕ возникает:");
        
        Integer safe = null;
        System.out.println("   Автоупаковка: Integer safe = null (безопасно)");
        
        Integer n1 = null;
        Integer n2 = null;
        System.out.println("   Сравнение null == null: " + (n1 == n2));
        
        System.out.println("   null.equals(something) вызовет NPE, но something.equals(null) - нет");
        String str = "test";
        System.out.println("   \"test\".equals(null): " + str.equals(null));
        
        Integer result = (true) ? null : 100;
        System.out.println("   Тернарный оператор: Integer result = (true) ? null : 100 = " + result);
        try {
            int test = result; 
            System.out.println("   Распаковка: " + test);
        } catch (NullPointerException e) {
            System.out.println("   NPE при распаковке результата тернарного оператора");
        }
    }
    
    public static void printInt(int value) {
        System.out.println("   Значение: " + value);
    }
}
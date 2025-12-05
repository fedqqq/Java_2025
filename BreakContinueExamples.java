public class BreakContinueExamples {
    public static void main(String[] args) {
        System.out.println("=== ПРИМЕРЫ BREAK И CONTINUE ===\n");
        
        // 1. ОПЕРАТОР BREAK В ЦИКЛЕ FOR
        System.out.println("1. Оператор break в цикле for:");
        System.out.println("   Поиск числа 5 в диапазоне 1-10:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("   Найдено число 5! Прерываем цикл.");
                break; 
            }
            System.out.println("   Текущее число: " + i);
        }
        
        // 2. ОПЕРАТОР CONTINUE В ЦИКЛЕ FOR
        System.out.println("\n2. Оператор continue в цикле for:");
        System.out.println("   Вывод только четных чисел от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { 
                continue; 
            }
            System.out.println("   Четное число: " + i);
        }
        
        // 3. ОПЕРАТОР BREAK В ЦИКЛЕ WHILE
        System.out.println("\n3. Оператор break в цикле while:");
        System.out.println("   Чтение чисел до ввода 0:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number;
        while (true) { 
            System.out.print("   Введите число (0 для выхода): ");
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println("   Выход из цикла.");
                break; 
            }
            System.out.println("   Вы ввели: " + number);
        }
        
        // 4. ОПЕРАТОР CONTINUE В ЦИКЛЕ WHILE
        System.out.println("\n4. Оператор continue в цикле while:");
        System.out.println("   Сумма положительных чисел (отрицательные пропускаем):");
        int sum = 0;
        int count = 0;
        while (count < 5) {
            System.out.print("   Введите число " + (count + 1) + ": ");
            int num = scanner.nextInt();
            count++;
            
            if (num < 0) {
                System.out.println("   Отрицательное число пропущено.");
                continue; 
            }
            
            sum += num;
            System.out.println("   Текущая сумма: " + sum);
        }
        System.out.println("   Итоговая сумма: " + sum);
        
        // 5. ОПЕРАТОР BREAK В ЦИКЛЕ DO-WHILE
        System.out.println("\n5. Оператор break в цикле do-while:");
        System.out.println("   Поиск первого числа, кратного 7:");
        int j = 1;
        do {
            if (j % 7 == 0) {
                System.out.println("   Найдено первое число, кратное 7: " + j);
                break;
            }
            j++;
        } while (true);
        
        // 6. ОПЕРАТОР CONTINUE В ЦИКЛЕ DO-WHILE
        System.out.println("\n6. Оператор continue в цикле do-while:");
        System.out.println("   Пропуск чисел, делящихся на 3:");
        int k = 0;
        do {
            k++;
            if (k % 3 == 0) {
                continue; 
            }
            System.out.println("   Число не кратное 3: " + k);
        } while (k < 10);
        
        // 7. BREAK С МЕТКОЙ (LABELED BREAK)
        System.out.println("\n7. Break с меткой (выход из вложенных циклов):");
        outerLoop: 
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == 2 && col == 2) {
                    System.out.println("   Найдена позиция (2,2). Выход из обоих циклов.");
                    break outerLoop; 
                }
                System.out.println("   Позиция: (" + row + "," + col + ")");
            }
        }
        
        // 8. CONTINUE С МЕТКОЙ (LABELED CONTINUE)
        System.out.println("\n8. Continue с меткой (пропуск итерации внешнего цикла):");
        outer: 
        for (int i = 1; i <= 3; i++) {
            System.out.println("   Внешний цикл, итерация: " + i);
            for (int m = 1; m <= 3; m++) {
                if (i == 2 && m == 2) {
                    System.out.println("   Пропускаем остаток внешней итерации 2.");
                    continue outer; 
                }
                System.out.println("   Внутренний цикл: " + m);
            }
        }
        
        // 9. BREAK В SWITCH (не в цикле)
        System.out.println("\n9. Break в операторе switch:");
        int day = 3;
        System.out.print("   День " + day + " это: ");
        switch (day) {
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            default: System.out.println("Выходной"); break;
        }
        
        scanner.close();
        
        // 10. ПРАКТИЧЕСКИЙ ПРИМЕР - ПОИСК ПРОСТОГО ЧИСЛА
        System.out.println("\n10. Практический пример - поиск простого числа:");
        int target = 17;
        boolean isPrime = true;
        
        for (int n = 2; n <= Math.sqrt(target); n++) {
            if (target % n == 0) {
                isPrime = false;
                break; 
            }
        }
        
        if (isPrime) {
            System.out.println("   Число " + target + " простое.");
        } else {
            System.out.println("   Число " + target + " составное.");
        }
    }
}
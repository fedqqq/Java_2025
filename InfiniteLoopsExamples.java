public class InfiniteLoopsExamples {
    public static void main(String[] args) {
        System.out.println("=== БЕСКОНЕЧНЫЕ ЦИКЛЫ WHILE И DO-WHILE ===\n");
        
        System.out.println("1. БЕСКОНЕЧНЫЙ ЦИКЛ WHILE:");
        System.out.println("   while (true) { ... }");
        
        System.out.println("   Цикл закомментирован, чтобы программа не зависала.");
        
        System.out.println("\n2. БЕСКОНЕЧНЫЙ ЦИКЛ DO-WHILE:");
        System.out.println("   do { ... } while (true);");
        
        System.out.println("   Цикл закомментирован, чтобы программа не зависала.");
        
        System.out.println("\n3. ДРУГИЕ ВАРИАНТЫ БЕСКОНЕЧНЫХ ЦИКЛОВ:");
        
        System.out.println("   Вариант 1 - условие всегда true:");
        boolean condition = true;

        System.out.println("   Вариант 2 - бесконечный инкремент:");
        int i = 0;
    
        System.out.println("   Вариант 3 - отсутствие изменения переменной:");
        int counter = 5;
        
        System.out.println("\n4. ПРАКТИЧЕСКИЕ ПРИМЕРЫ С ВОЗМОЖНОСТЬЮ ВЫХОДА:");
        
        System.out.println("   Сервер, ожидающий подключений:");
        boolean serverRunning = true;
        int connectionCount = 0;
        while (serverRunning) {
            System.out.println("Принято соединение #" + (++connectionCount));
            

            if (connectionCount >= 5) {
                serverRunning = false;
                System.out.println("Сервер остановлен.");
            }
            
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("\n   Меню с возможностью выбора:");
        boolean menuActive = true;
        int choice = 0;
        
        while (menuActive) {
            System.out.println("\nМеню:");
            System.out.println("1. Опция 1");
            System.out.println("2. Опция 2");
            System.out.println("3. Выход");
            
            choice++;
            
            switch (choice) {
                case 1:
                    System.out.println("Выполняется опция 1");
                    break;
                case 2:
                    System.out.println("Выполняется опция 2");
                    break;
                case 3:
                    System.out.println("Выход из меню");
                    menuActive = false;
                    break;
            }
            
            if (choice >= 3) break; 
        }
        
        System.out.println("\n5. БЕСКОНЕЧНЫЙ ЦИКЛ DO-WHILE С ВЫХОДОМ:");
        
        boolean keepRunning = true;
        int iteration = 0;
        
        do {
            iteration++;
            System.out.println("Итерация do-while: " + iteration);
            
            if (iteration >= 3) {
                keepRunning = false;
            }
            
        } while (keepRunning);
        
        System.out.println("\n6. ОПАСНЫЙ БЕСКОНЕЧНЫЙ ЦИКЛ (КОММЕНТАРИЙ):");
        
        System.out.println("   Цикл закомментирован как пример ошибки программиста.");
        
        System.out.println("\n7. КАК ПРЕРВАТЬ БЕСКОНЕЧНЫЙ ЦИКЛ:");
        
        System.out.println("   Способ 1: Использовать break");
        int count = 0;
        while (true) {
            count++;
            if (count > 3) {
                System.out.println("   Прервали цикл после " + count + " итераций");
                break;
            }
        }
        
        System.out.println("\n   Способ 2: Использовать return");
        
        System.out.println("\n   Способ 3: Использовать System.exit(0)");
    }
}
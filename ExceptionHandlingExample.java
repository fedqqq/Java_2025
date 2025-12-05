// Определяем иерархию исключений
class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        
        // 1. Одинаковая обработка для нескольких исключений (multi-catch) - разные ветви иерархии
        try {
            // Генерируем исключение
            throw new Ex2();
        } catch (Ex1 e) {  // Ex1 перехватит и Ex2, и Ex3
            System.out.println("Поймано исключение (Ex1 или его подкласс): " + e.getClass().getSimpleName());
        }

        // 2. Обработка иерархии исключений (от младшего к старшему)
        try {
            throw new Ex3();  // Генерируем Ex3
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3");
        } catch (Ex2 e) {
            System.out.println("Поймано Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1");
        }
        
        // 3. Демонстрация, что catch для предка ловит и потомков
        try {
            throw new Ex3();  // Генерируем Ex3
        } catch (Ex1 e) {  // Ex1 - предок Ex2 и Ex3
            System.out.println("Поймано исключение в блоке Ex1 (это может быть Ex1, Ex2 или Ex3): " 
                + e.getClass().getSimpleName());
        }
    }
}
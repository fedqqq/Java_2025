public class FormatSpecifiersExample {
    public static void main(String[] args) {
        // Примеры использования спецификаторов формата
        
        // 1. %s - для строк
        String name = "Федор";
        System.out.printf("Имя: %s%n", name);
        
        // 2. %d - для целых чисел
        int age = 25;
        System.out.printf("Возраст: %d лет%n", age);
        
        // 3. %f - для дробных чисел
        double height = 1.85;
        System.out.printf("Рост: %.2f м%n", height); // .2 - две цифры после запятой
        
        // 4. %c - для символов
        char grade = 'A';
        System.out.printf("Оценка: %c%n", grade);
        
        // 5. %b - для булевых значений
        boolean isStudent = true;
        System.out.printf("Студент: %b%n", isStudent);
        
        // Дополнительный пример: несколько спецификаторов в одной строке
        System.out.printf("%s, возраст %d лет, рост %.2f м, оценка %c, студент: %b%n", 
                         name, age, height, grade, isStudent);
    }
}
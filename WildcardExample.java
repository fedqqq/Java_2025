import java.util.*;

// Пример использования <? extends T>
class ExtendsExample {
    // Метод принимает список любого типа, который является подтипом Number
    public static double sum(List<? extends Number> numbers) {
        double total = 0;
        for (Number num : numbers) {
            total += num.doubleValue();
        }
        return total;
    }
}

// Пример использования <? super T>
class SuperExample {
    // Метод добавляет целые числа в список, который может содержать Integer или его супертипы
    public static void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
    }
}

public class WildcardExample {
    public static void main(String[] args) {
        // <? extends Number>
        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println("Sum integers: " + ExtendsExample.sum(ints));
        
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum doubles: " + ExtendsExample.sum(doubles));
        
        // <? super Integer>
        List<Number> numbers = new ArrayList<>();
        SuperExample.addIntegers(numbers);
        System.out.println("Numbers: " + numbers);
        
        List<Object> objects = new ArrayList<>();
        SuperExample.addIntegers(objects);
        System.out.println("Objects: " + objects);
        
        // Пример с коллекциями
        List<? extends Number> producer = ints; // можно читать
        Number n = producer.get(0); // OK
        
        List<? super Integer> consumer = numbers; // можно писать
        consumer.add(42); // OK
        // Integer i = consumer.get(0); // Ошибка компиляции
    }
}
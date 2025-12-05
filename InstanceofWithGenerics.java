import java.util.*;

public class InstanceofWithGenerics {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        System.out.println(stringList instanceof List);  // true
        System.out.println(integerList instanceof List); // true
        System.out.println(map instanceof Map);          // true

        System.out.println(stringList instanceof ArrayList);  // true
        System.out.println(map instanceof HashMap);           // true

        System.out.println(stringList instanceof List<?>);  // true

        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(123);

        System.out.println(stringBox instanceof Box);      // true
        System.out.println(stringBox instanceof Box<?>);   // true
        Object obj = getData();
        
        if (obj instanceof List) {
            List<?> list = (List<?>) obj;
            System.out.println("Это список с " + list.size() + " элементами");
            
            if (!list.isEmpty() && list.get(0) instanceof String) {
                System.out.println("Это список строк");
            }
        }

        Object anotherObj = getData();
        
        if (anotherObj instanceof List<?> list) {
            System.out.println("Pattern matching: список размером " + list.size());
        }
    }

    public static Object getData() {
        return Arrays.asList("apple", "banana", "orange");
    }
}

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
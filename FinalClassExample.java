// Объявляем final класс
final class FinalClass {
    public void show() {
        System.out.println("Это финальный класс");
    }
}

// Попытка наследовать final класс приведет к ошибке компиляции
// class SubClass extends FinalClass {
//     public void display() {
//         System.out.println("Попытка наследования");
//     }
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
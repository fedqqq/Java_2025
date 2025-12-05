class SuperClass {
    // Объявляем final метод
    public final void finalMethod() {
        System.out.println("Это финальный метод в суперклассе");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределить final метод приведет к ошибке компиляции
    // public void finalMethod() {
    //     System.out.println("Попытка переопределить");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.finalMethod(); // Вызовет метод из SuperClass
    }
}
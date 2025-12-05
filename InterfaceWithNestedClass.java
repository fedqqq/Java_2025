interface MyInterface {
    void interfaceMethod();

    // Вложенный класс в интерфейсе (неявно public static)
    class NestedClass {
        public void nestedMethod() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }

        public static void staticNestedMethod() {
            System.out.println("Статический метод вложенного класса");
        }
    }
}

class MyClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Реализация метода интерфейса");
    }
}

public class InterfaceWithNestedClass {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.nestedMethod();

        // Вызов статического метода вложенного класса
        MyInterface.NestedClass.staticNestedMethod();

        // Использование реализации интерфейса
        MyInterface obj = new MyClass();
        obj.interfaceMethod();
    }
}
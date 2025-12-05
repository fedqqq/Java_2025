// Примеры использования аннотаций

class Parent {
    // Устаревший метод
    @Deprecated
    public void oldMethod() {
        System.out.println("Старый метод");
    }
    
    public void normalMethod() {
        System.out.println("Обычный метод");
    }
}

class Child extends Parent {
    // @Override - указывает, что метод переопределяет метод родителя
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный метод");
    }
    
    // @SuppressWarnings - подавляет предупреждения компилятора
    @SuppressWarnings("deprecation")
    public void useOldMethodNoWarning() {
        oldMethod(); // Предупреждение будет подавлено
    }
    
    // Пример с непроверяемыми типами (raw types)
    @SuppressWarnings("rawtypes")
    public void useRawType() {
        java.util.List list = new java.util.ArrayList(); // Предупреждение о raw type
        list.add("test");
    }
}

public class AnnotationExamples {
    public static void main(String[] args) {
        Child child = new Child();
        child.normalMethod();
        child.useOldMethodNoWarning();
        child.useRawType();
        
        // Пример @SuppressWarnings для блока кода
        @SuppressWarnings("unused")
        int unusedVariable = 42; // Предупреждение о неиспользуемой переменной будет подавлено
    }
}

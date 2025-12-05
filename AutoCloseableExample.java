// Пользовательский ресурс, реализующий AutoCloseable
class MyResource implements AutoCloseable {
    private String name;
    
    public MyResource(String name) {
        this.name = name;
        System.out.println("Ресурс '" + name + "' создан");
    }
    
    public void use() {
        System.out.println("Используем ресурс '" + name + "'");
    }
    
    @Override
    public void close() {
        System.out.println("Ресурс '" + name + "' закрыт");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        // Использование try-with-resources
        try (MyResource resource1 = new MyResource("Первый");
             MyResource resource2 = new MyResource("Второй")) {
            
            resource1.use();
            resource2.use();
            
            // Может возникнуть исключение
            // int result = 10 / 0;
            
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        
        System.out.println("Программа продолжает работу");
    }
}
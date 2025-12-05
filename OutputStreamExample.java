import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            // Запись отдельных байтов
            fos.write(72);  // H
            fos.write(101); // e
            fos.write(108); // l
            fos.write(108); // l
            fos.write(111); // o
            
            System.out.println("Данные записаны в файл output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
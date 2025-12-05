public class OverloadedPlusOperatorExample {
    public static void main(String[] args) {
        String firstName = "Федор";
        int age = 25;
        double height = 1.85;
        boolean isStudent = true;
        char grade = 'A';
        
        String info = "Имя: " + firstName + 
                     ", Возраст: " + age + 
                     ", Рост: " + height + 
                     ", Студент: " + isStudent + 
                     ", Оценка: " + grade;
        System.out.println("Строка + примитивы: " + info);
    }
}

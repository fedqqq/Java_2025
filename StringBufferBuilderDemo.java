public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        // 1. append() - добавляет строку в конец
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println("1. append: " + sb1);
        
        // 2. insert() - вставляет строку по указанной позиции
        sb1.insert(5, " Java");
        System.out.println("2. insert: " + sb1);
        
        // 3. delete() - удаляет символы в указанном диапазоне
        sb1.delete(5, 10);
        System.out.println("3. delete: " + sb1);
        
        // 4. reverse() - переворачивает строку
        sb1.reverse();
        System.out.println("4. reverse: " + sb1);
        sb1.reverse(); // возвращаем обратно
        
        // 5. replace() - заменяет часть строки
        sb1.replace(6, 11, "Everyone");
        System.out.println("5. replace: " + sb1);
        
        // 6. charAt() - возвращает символ по индексу
        char ch = sb1.charAt(0);
        System.out.println("6. charAt(0): " + ch);
        
        // 7. setCharAt() - устанавливает символ по индексу
        sb1.setCharAt(0, 'h');
        System.out.println("7. setCharAt: " + sb1);
        
        // 8. length() - возвращает длину строки
        int len = sb1.length();
        System.out.println("8. length: " + len);
        
        // 9. capacity() - возвращает текущую емкость буфера
        int cap = sb1.capacity();
        System.out.println("9. capacity: " + cap);
        
        // 10. substring() - возвращает подстроку
        String sub = sb1.substring(0, 5);
        System.out.println("10. substring(0,5): " + sub);
        
        // Дополнительно: toString() - преобразует в String
        String result = sb1.toString();
        System.out.println("toString(): " + result);
        
        // Сравнение StringBuffer и StringBuilder
        StringBuffer sbf = new StringBuffer("Buffer");
        StringBuilder sbd = new StringBuilder("Builder");
        
        sbf.append(" test");
        sbd.append(" test");
        
        System.out.println("StringBuffer: " + sbf);
        System.out.println("StringBuilder: " + sbd);
    }
}

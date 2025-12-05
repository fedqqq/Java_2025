public class AllOperatorsExamples {
    public static void main(String[] args) {
        System.out.println("=== ОПЕРАТОРЫ ПРИСВАИВАНИЯ =, +=, -=, *=, /=, %= ===\n");
        
        System.out.println("1. Базовые типы:");
        int a = 10;
        System.out.println("   a = 10: " + a);
        
        a += 5; // a = a + 5
        System.out.println("   a += 5: " + a);
        
        a -= 3; // a = a - 3
        System.out.println("   a -= 3: " + a);
        
        a *= 2; // a = a * 2
        System.out.println("   a *= 2: " + a);
        
        a /= 4; // a = a / 4
        System.out.println("   a /= 4: " + a);
        
        a %= 3; // a = a % 3
        System.out.println("   a %= 3: " + a);
        
        double d = 10.5;
        d /= 2; 
        System.out.println("   double 10.5 /= 2: " + d);
        
        System.out.println("\n2. Строки (только +=):");
        String text = "Hello";
        System.out.println("   text = \"Hello\": " + text);
        text += " World"; // Конкатенация строк
        System.out.println("   text += \" World\": " + text);
        
        System.out.println("\n=== ТЕРНАРНЫЙ ОПЕРАТОР ?: ===\n");
        
        int x = 10;
        int y = 20;
        int max = (x > y) ? x : y;
        System.out.println("   max = (10 > 20) ? 10 : 20 = " + max);
        
        String result = (x % 2 == 0) ? "четное" : "нечетное";
        System.out.println("   10 is " + result);
        
        String strResult = (text.length() > 5) ? "Длинная строка" : "Короткая строка";
        System.out.println("   \"" + text + "\" is " + strResult);
        
        System.out.println("\n=== ЛОГИЧЕСКИЕ ОПЕРАТОРЫ || и && ===\n");
        
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println("   true || false = " + (b1 || b2));
        System.out.println("   true && false = " + (b1 && b2));
        
        int counter = 0;
        boolean shortCircuit = (b1 || (++counter > 0));
        System.out.println("   Короткое замыкание ||, counter = " + counter);
        
        counter = 0;
        shortCircuit = (b2 && (++counter > 0));
        System.out.println("   Короткое замыкание &&, counter = " + counter);
        
        String str1 = null;
        if (str1 != null && str1.length() > 0) {
            System.out.println("   str1 не пустая");
        } else {
            System.out.println("   str1 null или пустая");
        }
        
        System.out.println("\n=== ПОБИТОВЫЕ ОПЕРАТОРЫ |, ^, & ===\n");
        
        int num1 = 12; 
        int num2 = 10; 
        
        System.out.println("   num1 = 12 (binary: 1100)");
        System.out.println("   num2 = 10 (binary: 1010)");
        System.out.println("   num1 | num2 = " + (num1 | num2) + " (binary: " + 
                          Integer.toBinaryString(num1 | num2) + ")");
        System.out.println("   num1 ^ num2 = " + (num1 ^ num2) + " (binary: " + 
                          Integer.toBinaryString(num1 ^ num2) + ")");
        System.out.println("   num1 & num2 = " + (num1 & num2) + " (binary: " + 
                          Integer.toBinaryString(num1 & num2) + ")");
        
        System.out.println("\n   Для boolean (не побитовые, а логические):");
        System.out.println("   true | false = " + (true | false));
        System.out.println("   true ^ false = " + (true ^ false)); 
        System.out.println("   true & false = " + (true & false));
        
        System.out.println("\n=== ОПЕРАТОРЫ СРАВНЕНИЯ ==, >, >=, <, <= ===\n");
        
        int p = 5, q = 10;
        System.out.println("   p = 5, q = 10");
        System.out.println("   p == q: " + (p == q));
        System.out.println("   p > q: " + (p > q));
        System.out.println("   p >= q: " + (p >= q));
        System.out.println("   p < q: " + (p < q));
        System.out.println("   p <= q: " + (p <= q));
        
        System.out.println("\n   Сравнение строк:");
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        
        System.out.println("   s1 = \"hello\", s2 = \"hello\", s3 = new String(\"hello\")");
        System.out.println("   s1 == s2: " + (s1 == s2)); 
        System.out.println("   s1 == s3: " + (s1 == s3)); 
        System.out.println("   s1.equals(s3): " + s1.equals(s3)); 
        
        System.out.println("\n=== ОПЕРАТОРЫ СДВИГА >>, >>>, << ===\n");
        
        int value = 16; 
        System.out.println("   value = 16 (binary: " + Integer.toBinaryString(value) + ")");
        
        System.out.println("   value >> 1 = " + (value >> 1) + 
                         " (binary: " + Integer.toBinaryString(value >> 1) + ")");
        System.out.println("   value << 1 = " + (value << 1) + 
                         " (binary: " + Integer.toBinaryString(value << 1) + ")");
        
        int negative = -16;
        System.out.println("\n   negative = -16 (binary: " + Integer.toBinaryString(negative) + ")");
        System.out.println("   negative >> 1 = " + (negative >> 1) + 
                         " (binary: " + Integer.toBinaryString(negative >> 1) + ")");
        System.out.println("   negative >>> 1 = " + (negative >>> 1) + 
                         " (binary: " + Integer.toBinaryString(negative >>> 1) + ")");
        
        System.out.println("\n=== АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ +, -, *, /, % ===\n");
        
        int m = 15, n = 4;
        System.out.println("   m = 15, n = 4");
        System.out.println("   m + n = " + (m + n));
        System.out.println("   m - n = " + (m - n));
        System.out.println("   m * n = " + (m * n));
        System.out.println("   m / n = " + (m / n));
        System.out.println("   m % n = " + (m % n));
        
        System.out.println("\n   Для строк (только +):");
        String hello = "Hello";
        String world = "World";
        String helloWorld = hello + " " + world;
        System.out.println("   \"Hello\" + \" \" + \"World\" = " + helloWorld);
        
        String mixed = "Number: " + 42 + ", Double: " + 3.14 + ", Boolean: " + true;
        System.out.println("   Конкатенация разных типов: " + mixed);
        
        System.out.println("\n=== УНАРНЫЕ ОПЕРАТОРЫ ++, --, ~, ! ===\n");
        
        System.out.println("Префиксный и постфиксный ++, --:");
        
        int counter1 = 5;
        int prefixIncrement = ++counter1; 
        System.out.println("   int counter1 = 5;");
        System.out.println("   int prefixIncrement = ++counter1;");
        System.out.println("   prefixIncrement = " + prefixIncrement + ", counter1 = " + counter1);
        
        counter1 = 5;
        int postfixIncrement = counter1++; 
        System.out.println("\n   counter1 = 5;");
        System.out.println("   int postfixIncrement = counter1++;");
        System.out.println("   postfixIncrement = " + postfixIncrement + ", counter1 = " + counter1);
        
        System.out.println("\n   Примеры в выражениях:");
        int i = 0;
        System.out.println("   i = 0");
        System.out.println("   i++ + ++i = " + (i++ + ++i) + " (сначала i++ = 0, i=1, потом ++i = 2, сумма=2)");
        
        System.out.println("\n   Побитовое НЕ (~):");
        int num = 5; 
        System.out.println("   ~5 = " + (~num) + " (binary: " + Integer.toBinaryString(~num) + ")");
        
        System.out.println("\n   Логическое НЕ (!):");
        boolean flag = true;
        System.out.println("   !true = " + !flag);
        System.out.println("   !!true = " + !!flag);
        
        System.out.println("\n=== ОПЕРАТОРЫ ПРИОРИТЕТА ( ) ===\n");
        
        System.out.println("   Скобки изменяют порядок вычислений:");
        int withoutParens = 2 + 3 * 4; // 14
        int withParens = (2 + 3) * 4; // 20
        System.out.println("   2 + 3 * 4 = " + withoutParens);
        System.out.println("   (2 + 3) * 4 = " + withParens);
        
        System.out.println("\n   Скобки в логических выражениях:");
        boolean logicWithoutParens = true || false && false; 
        boolean logicWithParens = (true || false) && false; 
        System.out.println("   true || false && false = " + logicWithoutParens);
        System.out.println("   (true || false) && false = " + logicWithParens);
        
        System.out.println("\n   Скобки в побитовых операциях:");
        int bitWithoutParens = 5 | 3 & 2; // 5 | (3 & 2) = 5 | 2 = 7
        int bitWithParens = (5 | 3) & 2; // 7 & 2 = 2
        System.out.println("   5 | 3 & 2 = " + bitWithoutParens);
        System.out.println("   (5 | 3) & 2 = " + bitWithParens);
        
        System.out.println("\n=== КОМБИНИРОВАННЫЕ ПРИМЕРЫ ===\n");
        
        System.out.println("   Комбинированные выражения:");
        
        int val = 1;
        boolean complex = (val++ > 0) && (--val == 1) || (val += 5) > 0;
        System.out.println("   (val++ > 0) && (--val == 1) || (val += 5) > 0");
        System.out.println("   Результат: " + complex + ", val = " + val);

        int age = 25;
        String category = (age < 18) ? "ребенок" : (age < 65) ? "взрослый" : "пенсионер";
        System.out.println("\n   Возраст " + age + ": " + category);

        int number = 17;
        boolean isEven = (number & 1) == 0; 
        System.out.println("\n   Число " + number + " четное? " + isEven);
        
        int quickMult = 7 << 2; // 7 * 4
        int quickDiv = 28 >> 2; // 28 / 4
        System.out.println("   7 << 2 = " + quickMult + " (7 * 4)");
        System.out.println("   28 >> 2 = " + quickDiv + " (28 / 4)");
        
        System.out.println("\n   Составные операторы с разными типами:");
        float floatVal = 10.5f;
        floatVal *= 2; // floatVal = floatVal * 2
        System.out.println("   float 10.5f *= 2: " + floatVal);
        
        long longVal = 100L;
        longVal %= 7; // longVal = longVal % 7
        System.out.println("   long 100L %= 7: " + longVal);
        
        char ch = 'A';
        ch += 2; // ch = (char)(ch + 2)
        System.out.println("   char 'A' += 2: '" + ch + "'");
        
        System.out.println("\n   Сложное выражение:");
        int complexVal = 10;
        int resultComplex = (++complexVal * 2) + (complexVal-- % 3) - (~complexVal);
        System.out.println("   (++complexVal * 2) + (complexVal-- % 3) - (~complexVal) = " + resultComplex);
    }
}

public class MixedTypeArithmetic {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        
        int result1 = b + s;
        System.out.println("1. byte(10) + short(20) = int(" + result1 + ")");
        
        long result2 = i + l;
        System.out.println("2. int(30) + long(40) = long(" + result2 + ")");
        
        int intValue = 7;
        float floatValue = 2.5f;
        double doubleValue = 3.14;
        
        float result3 = intValue + floatValue;
        System.out.println("3. int(7) + float(2.5) = float(" + result3 + ")");
        
        double result4 = intValue + doubleValue;
        System.out.println("4. int(7) + double(3.14) = double(" + result4 + ")");
        
        double result5 = floatValue + doubleValue;
        System.out.println("5. float(2.5) + double(3.14) = double(" + result5 + ")");
        
        int a = 10;
        int b2 = 3;
        
        int intDivision = a / b2;
        System.out.println("6. 10 / 3 (оба int) = int(" + intDivision + ")");
        
        double doubleDivision = a / 3.0;
        System.out.println("7. 10 / 3.0 (int / double) = double(" + doubleDivision + ")");
        
        double castDivision = (double) a / b2;
        System.out.println("8. (double)10 / 3 = double(" + castDivision + ")");
        
        byte smallByte = 100;
        byte anotherByte = 50;
        
        byte sumBytes = (byte)(smallByte + anotherByte);
        System.out.println("9. (byte)(100 + 50) = byte(" + sumBytes + ")");
        
        byte overflow = (byte)(127 + 1);
        System.out.println("10. (byte)(127 + 1) = byte(" + overflow + ") (переполнение!)");

        byte x = 10;
        short y = 20;
        int z = 30;
        long w = 40L;
        float f = 5.5f;
        double d = 6.6;
        
        double complexResult = x + y + z + w + f + d;
        System.out.println("11. byte+short+int+long+float+double = double(" + complexResult + ")");
        
        char ch = 'A'; 
        int charIntSum = ch + 5;
        System.out.println("12. 'A'(65) + 5 = int(" + charIntSum + ") -> символ: " + (char)charIntSum);
        
        Integer integerObj = 100;
        Double doubleObj = 50.5;
        
        double wrapperResult = integerObj + doubleObj;
        System.out.println("13. Integer(100) + Double(50.5) = double(" + wrapperResult + ")");

        float float1 = 1.23456789f;
        double double1 = 1.23456789;
        
        System.out.println("14. float точность: " + float1);
        System.out.println("15. double точность: " + double1);
        
        double mixedPrecision = float1 + double1;
        System.out.println("16. float + double = double(" + mixedPrecision + ")");
        
        double preciseDivision = 10.0 / 3;
        System.out.println("17. 10.0 / 3 = " + preciseDivision);
        
        int intOp = 1 / 2;
        float floatOp = 1 / 2.0f;
        double doubleOp = 1.0 / 2;
        
        System.out.println("18. 1 / 2 (int) = " + intOp);
        System.out.println("19. 1 / 2.0f (float) = " + floatOp);
        System.out.println("20. 1.0 / 2 (double) = " + doubleOp);
    }
}
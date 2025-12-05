public class NarrowingConversionExamples {
    public static void main(String[] args) {
        System.out.println("=== ПРИМЕРЫ СУЖАЮЩЕГО ПРЕОБРАЗОВАНИЯ ТИПОВ ===\n");
        
        System.out.println("1. Double/Float -> Целочисленные типы:");
        
        double pi = 3.14159265359;
        int piToInt = (int) pi;
        System.out.println("   double " + pi + " -> int: " + piToInt);
        
        float price = 299.99f;
        int priceInt = (int) price;
        System.out.println("   float " + price + " -> int: " + priceInt);
        
        System.out.println("\n2. Переполнение при сужении:");
        
        int largeInt = 1000;
        byte largeToByte = (byte) largeInt;
        System.out.println("   int " + largeInt + " -> byte: " + largeToByte);
        System.out.println("   Объяснение: 1000 % 256 = " + (1000 % 256) + ", но byte: -128..127");
        System.out.println("   Фактически: 1000 -> (1000 - 256*3) = " + (1000 - 256*3) + " -> в byte: " + largeToByte);
        
        long hugeLong = 1234567890123L;
        int hugeToInt = (int) hugeLong; 
        System.out.println("   long " + hugeLong + " -> int: " + hugeToInt);
        
        System.out.println("\n3. Целые -> более узкие целые:");
        
        int intValue = 300;
        short intToShort = (short) intValue; 
        System.out.println("   int " + intValue + " -> short: " + intToShort);
        
        short shortValue = 150;
        byte shortToByte = (byte) shortValue; 
        System.out.println("   short " + shortValue + " -> byte: " + shortToByte);
        
        System.out.println("\n4. Отрицательные числа:");
        
        int negativeInt = -100;
        byte negativeByte = (byte) negativeInt;
        System.out.println("   int " + negativeInt + " -> byte: " + negativeByte);
        
        double negativeDouble = -3.75;
        int negativeDoubleToInt = (int) negativeDouble; 
        System.out.println("   double " + negativeDouble + " -> int: " + negativeDoubleToInt);
        
        System.out.println("\n5. Граничные значения:");
        
        int maxInt = Integer.MAX_VALUE; 
        short maxIntToShort = (short) maxInt;
        System.out.println("   int.MAX_VALUE " + maxInt + " -> short: " + maxIntToShort);
        
        int minInt = Integer.MIN_VALUE; 
        short minIntToShort = (short) minInt;
        System.out.println("   int.MIN_VALUE " + minInt + " -> short: " + minIntToShort);
        
        System.out.println("\n6. Сужающие преобразования с char:");
        
        int intForChar = 65;
        char intToChar = (char) intForChar;
        System.out.println("   int " + intForChar + " -> char: '" + intToChar + "'");
        
        char letter = 'Z';
        byte charToByte = (byte) letter; // Код 'Z' = 90
        System.out.println("   char '" + letter + "' -> byte: " + charToByte);
        
        char cyrillic = 'Я';
        int charToInt = (int) cyrillic; 
        byte cyrillicToByte = (byte) cyrillic; 
        System.out.println("   char '" + cyrillic + "' (код " + charToInt + ") -> byte: " + cyrillicToByte);
        
        System.out.println("\n7. Многократное сужение:");
        
        double startValue = 12345.6789;
        int step1 = (int) startValue; 
        short step2 = (short) step1;  
        byte step3 = (byte) step2;    
        System.out.println("   double " + startValue + " -> int: " + step1);
        System.out.println("   int " + step1 + " -> short: " + step2);
        System.out.println("   short " + step2 + " -> byte: " + step3);
        
        System.out.println("\n8. Сужающее преобразование с классами-обертками:");
        
        Double doubleObj = 123.456;
        int fromDoubleObj = doubleObj.intValue(); 
        System.out.println("   Double " + doubleObj + " -> int (через intValue()): " + fromDoubleObj);
        
        Integer integerObj = 500;
        byte fromIntegerObj = integerObj.byteValue(); 
        System.out.println("   Integer " + integerObj + " -> byte (через byteValue()): " + fromIntegerObj);
        
        System.out.println("\n9. Потеря точности:");
        
        double precise = 1.9999999999999999;
        float toFloat = (float) precise; 
        System.out.println("   double " + precise + " -> float: " + toFloat);
        System.out.println("   Разница: " + (precise - toFloat));
        
        System.out.println("\n10. Опасные примеры:");
        
        int safeLooking = 128;
        byte dangerous = (byte) safeLooking;
        System.out.println("   int " + safeLooking + " -> byte: " + dangerous + " (ОЙ! 128 стало -128)");
        
        int valueToConvert = 200;
        if (valueToConvert >= Byte.MIN_VALUE && valueToConvert <= Byte.MAX_VALUE) {
            byte safeByte = (byte) valueToConvert;
            System.out.println("   Безопасное преобразование " + valueToConvert + " -> byte: " + safeByte);
        } else {
            System.out.println("   Опасное преобразование " + valueToConvert + " -> byte невозможно без потери!");
        }
        
        System.out.println("\n11. Сужающие преобразования в выражениях:");
        
        double d1 = 10.5;
        double d2 = 20.3;
        int sumAsInt = (int)(d1 + d2); 
        System.out.println("   (int)(" + d1 + " + " + d2 + ") = " + sumAsInt);
        
        int truncatedSum = (int)d1 + (int)d2; 
        System.out.println("   (int)" + d1 + " + (int)" + d2 + " = " + truncatedSum);
    }
}

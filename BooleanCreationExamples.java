public class BooleanCreationExamples {
    public static void main(String[] args) {
        System.out.println("=== ВСЕ СПОСОБЫ СОЗДАНИЯ BOOLEAN ===\n");
        
        System.out.println("1. Конструктор с boolean (deprecated):");
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        System.out.println("   new Boolean(true) = " + b1);
        System.out.println("   new Boolean(false) = " + b2);
        
        System.out.println("\n2. Конструктор со строкой (deprecated):");
        Boolean b3 = new Boolean("true");
        Boolean b4 = new Boolean("false");
        Boolean b5 = new Boolean("TRUE");
        Boolean b6 = new Boolean("True");
        Boolean b7 = new Boolean("любой текст"); 
        System.out.println("   new Boolean(\"true\") = " + b3);
        System.out.println("   new Boolean(\"false\") = " + b4);
        System.out.println("   new Boolean(\"TRUE\") = " + b5);
        System.out.println("   new Boolean(\"True\") = " + b6);
        System.out.println("   new Boolean(\"любой текст\") = " + b7);
        
        System.out.println("\n3. Boolean.valueOf(boolean):");
        Boolean b8 = Boolean.valueOf(true);
        Boolean b9 = Boolean.valueOf(false);
        System.out.println("   Boolean.valueOf(true) = " + b8);
        System.out.println("   Boolean.valueOf(false) = " + b9);
        
        System.out.println("\n4. Boolean.valueOf(String):");
        Boolean b10 = Boolean.valueOf("true");
        Boolean b11 = Boolean.valueOf("false");
        Boolean b12 = Boolean.valueOf("TRUE");
        Boolean b13 = Boolean.valueOf("True");
        Boolean b14 = Boolean.valueOf("любой текст"); // false
        System.out.println("   Boolean.valueOf(\"true\") = " + b10);
        System.out.println("   Boolean.valueOf(\"false\") = " + b11);
        System.out.println("   Boolean.valueOf(\"TRUE\") = " + b12);
        System.out.println("   Boolean.valueOf(\"True\") = " + b13);
        System.out.println("   Boolean.valueOf(\"любой текст\") = " + b14);
        
        System.out.println("\n5. Автоупаковка (autoboxing):");
        Boolean b15 = true;
        Boolean b16 = false;
        System.out.println("   Boolean b15 = true; -> " + b15);
        System.out.println("   Boolean b16 = false; -> " + b16);
        
        System.out.println("\n6. Константы Boolean.TRUE и Boolean.FALSE:");
        Boolean b17 = Boolean.TRUE;
        Boolean b18 = Boolean.FALSE;
        System.out.println("   Boolean.TRUE = " + b17);
        System.out.println("   Boolean.FALSE = " + b18);
        
        System.out.println("\n7. Тернарный оператор:");
        int x = 10;
        int y = 5;
        Boolean b19 = (x > y) ? Boolean.TRUE : Boolean.FALSE;
        Boolean b20 = (x < y) ? true : false; 
        System.out.println("   (10 > 5) ? Boolean.TRUE : Boolean.FALSE = " + b19);
        System.out.println("   (10 < 5) ? true : false = " + b20);
        
        System.out.println("\n8. Boolean.parseBoolean(String):");
        boolean primitive = Boolean.parseBoolean("true");
        Boolean b21 = primitive; // автоупаковка
        Boolean b22 = Boolean.parseBoolean("false"); 
        System.out.println("   Boolean.parseBoolean(\"true\") -> автоупаковка = " + b21);
        System.out.println("   Boolean.parseBoolean(\"false\") -> автоупаковка = " + b22);
        
        System.out.println("\n=== СРАВНЕНИЕ И РЕКОМЕНДАЦИИ ===");
        System.out.println("Создадим Boolean всеми способами со значением true:");
        Boolean deprecated1 = new Boolean(true);     
        Boolean deprecated2 = new Boolean("true");   
        Boolean valueOf1 = Boolean.valueOf(true);    
        Boolean valueOf2 = Boolean.valueOf("true");  
        Boolean autobox = true;                      
        Boolean constant = Boolean.TRUE;             
        Boolean parse = Boolean.parseBoolean("true");
        
        System.out.println("Все созданные объекты равны по значению?");
        System.out.println("Сравнение через equals():");
        System.out.println("  Все равны? " + 
            (deprecated1.equals(deprecated2) &&
             deprecated2.equals(valueOf1) &&
             valueOf1.equals(valueOf2) &&
             valueOf2.equals(autobox) &&
             autobox.equals(constant) &&
             constant.equals(parse)));
        
        System.out.println("\nВажно: valueOf() кэширует объекты!");
        System.out.println("Boolean.valueOf(true) == Boolean.TRUE? " + 
            (Boolean.valueOf(true) == Boolean.TRUE));
        System.out.println("Boolean.valueOf(false) == Boolean.FALSE? " + 
            (Boolean.valueOf(false) == Boolean.FALSE));
        System.out.println("new Boolean(true) == Boolean.TRUE? " + 
            (new Boolean(true) == Boolean.TRUE)); 
    }
}
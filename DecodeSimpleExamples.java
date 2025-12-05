public class DecodeSimpleExamples {
    public static void main(String[] args) {
        System.out.println("=== ПРОСТЫЕ ПРИМЕРЫ decode() ===\n");

        System.out.println("1. Integer.decode():");
        System.out.println("   \"123\" -> " + Integer.decode("123"));
        System.out.println("   \"0123\" -> " + Integer.decode("0123") + " (восьмеричное)");
        System.out.println("   \"0x1A\" -> " + Integer.decode("0x1A") + " (шестнадцатеричное)");
        System.out.println("   \"-100\" -> " + Integer.decode("-100"));
        System.out.println("   \"#FF0000\" -> " + Integer.decode("#FF0000"));
        
        System.out.println("\n2. Long.decode():");
        System.out.println("   \"1000000\" -> " + Long.decode("1000000"));
        System.out.println("   \"0xFFFF\" -> " + Long.decode("0xFFFF"));
        
        System.out.println("\n3. Short и Byte:");
        System.out.println("   Short.decode(\"100\") -> " + Short.decode("100"));
        System.out.println("   Byte.decode(\"50\") -> " + Byte.decode("50"));
    }
}
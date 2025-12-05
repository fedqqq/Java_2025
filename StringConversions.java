public class StringConversions {
    public static void main(String[] args) {
        // 1. String → StringBuffer
        String str = "Hello";
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println("String → StringBuffer: " + sb1);
        
        // 2. String → StringBuilder  
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("String → StringBuilder: " + sb2);
        
        // 3. StringBuffer → String
        StringBuffer buffer = new StringBuffer("World");
        String strFromBuffer = buffer.toString();
        System.out.println("StringBuffer → String: " + strFromBuffer);
        
        // 4. StringBuilder → String
        StringBuilder builder = new StringBuilder("Java");
        String strFromBuilder = builder.toString();
        System.out.println("StringBuilder → String: " + strFromBuilder);
        
        // 5. StringBuffer → StringBuilder (через String)
        StringBuffer buffer2 = new StringBuffer("Test");
        StringBuilder builder2 = new StringBuilder(buffer2.toString());
        System.out.println("StringBuffer → StringBuilder: " + builder2);
        
        // 6. StringBuilder → StringBuffer (через String)
        StringBuilder builder3 = new StringBuilder("Example");
        StringBuffer buffer3 = new StringBuffer(builder3.toString());
        System.out.println("StringBuilder → StringBuffer: " + buffer3);
        
        // 7. StringBuffer → StringBuilder (через CharSequence конструктор)
        StringBuffer buffer4 = new StringBuffer("CharSeq");
        StringBuilder builder4 = new StringBuilder(buffer4);
        System.out.println("StringBuffer → StringBuilder (via CharSequence): " + builder4);
        
        // 8. StringBuilder → StringBuffer (через CharSequence конструктор)
        StringBuilder builder5 = new StringBuilder("Sequence");
        StringBuffer buffer5 = new StringBuffer(builder5);
        System.out.println("StringBuilder → StringBuffer (via CharSequence): " + buffer5);
    }
}
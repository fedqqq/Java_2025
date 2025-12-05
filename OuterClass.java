public class OuterClass {
    private String privateField = "private";
    protected String protectedField = "protected";
    String defaultField = "default";
    public String publicField = "public";
    
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
    
    void defaultMethod() {
        System.out.println("Default method");
    }
    
    public void publicMethod() {
        System.out.println("Public method");
    }
    
    // Внутренний класс
    class InnerClass {
        public void accessOuterFields() {
            // Имеет доступ ко всем полям внешнего класса
            System.out.println(privateField);
            System.out.println(protectedField);
            System.out.println(defaultField);
            System.out.println(publicField);
            
            // Имеет доступ ко всем методам внешнего класса
            privateMethod();
            protectedMethod();
            defaultMethod();
            publicMethod();
        }
    }
    
    public void testInner() {
        InnerClass inner = new InnerClass();
        inner.accessOuterFields();
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.testInner();
    }
}
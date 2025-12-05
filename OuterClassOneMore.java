public class OuterClassOneMore {
    // Внешний класс создает экземпляр внутреннего класса
    public void accessInner() {
        InnerClass inner = new InnerClass();
        
        // Доступ к public полю внутреннего класса
        System.out.println(inner.publicField);
        inner.publicMethod();
        
        // Доступ к protected полю (так как в одном классе)
        System.out.println(inner.protectedField);
        inner.protectedMethod();
        
        // Доступ к default полю (так как в одном классе)
        System.out.println(inner.defaultField);
        inner.defaultMethod();
        
        // Доступ к private полю (так как в одном классе)
        // System.out.println(inner.privateField); // ОШИБКА
        // inner.privateMethod(); // ОШИБКА
    }
    
    // Внутренний класс
    class InnerClass {
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
    }
    
    // Другой метод внешнего класса
    public void test() {
        InnerClass inner = new InnerClass();
        // Внутри внешнего класса можно создать экземпляр внутреннего класса
        // и получить доступ к его членам в соответствии с модификаторами доступа
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInner();
    }
}
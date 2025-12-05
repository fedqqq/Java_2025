public class Outer {
    // public inner class - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner");
        }
    }
    
    // protected inner class - доступен в пакете и наследникам Outer
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner");
        }
    }
    
    // default inner class - доступен только в пакете
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner");
        }
    }
    
    // private inner class - доступен только в Outer
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner");
        }
    }
    
    // Метод для доступа к приватному внутреннему классу
    public void accessPrivateInner() {
        PrivateInner privateInner = new PrivateInner();
        privateInner.show();
    }
}

// Класс в том же пакете
class SamePackage {
    void test() {
        Outer outer = new Outer();
        
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();
        
        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();
        
        Outer.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();
        
        // Нельзя создать PrivateInner из другого класса
        // Outer.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка
    }
}
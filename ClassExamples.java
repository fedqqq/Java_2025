public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("Public class");
    }
}

class DefaultClass {
    void show() {
        System.out.println("Default class method");
    }
}

class OuterClass {
    protected class ProtectedInnerClass {
        void display() {
            System.out.println("Protected inner class");
        }
    }
}

class AnotherClass {
    private class PrivateInnerClass {
        void print() {
            System.out.println("Private inner class");
        }
    }
}

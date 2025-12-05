class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException("Это мое исключение!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

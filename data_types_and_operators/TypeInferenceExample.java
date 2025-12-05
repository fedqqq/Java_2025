import java.util.List;

public class TypeInferenceExample {
    public static void main(String[] args) {
        // Без type inference
        String message1 = "Hello";  
        List<String> names1 = new ArrayList<>();
        
        var message2 = "Hello";      
        var names2 = new ArrayList<String>();  
        var number = 42;             
        var pi = 3.14159;           
        var list = List.of(1, 2, 3); 
    }
}

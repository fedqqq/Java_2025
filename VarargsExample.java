public class VarargsExample {
    
    // Перегрузка с разным количеством параметров
    public void printNumbers(int... numbers) {
        System.out.print("int varargs: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void printNumbers(double... numbers) {
        System.out.print("double varargs: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void printNumbers(String... strings) {
        System.out.print("String varargs: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    // Комбинация обычного параметра и varargs
    public void printNumbers(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Два параметра varargs не допускается
    // public void printNumbers(int... a, int... b) {} // ОШИБКА
    
    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();
        
        example.printNumbers(1, 2, 3);
        example.printNumbers(1.5, 2.5, 3.5);
        example.printNumbers("A", "B", "C");
        example.printNumbers("Результат", 10, 20, 30);
        
        // Можно передать массив
        example.printNumbers(new int[]{4, 5, 6});
    }
}

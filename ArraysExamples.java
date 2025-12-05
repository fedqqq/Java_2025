import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        // 1. toString()
        int[] arr = {5, 3, 1, 4, 2};
        System.out.println(Arrays.toString(arr));

        // 2. binarySearch()
        int[] sorted = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(sorted, 3);
        System.out.println(index);

        // 3. equals()
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        boolean eq = Arrays.equals(a1, a2);
        System.out.println(eq);

        // 4. compare()
        int[] b1 = {1, 2, 3};
        int[] b2 = {1, 2, 4};
        int cmp = Arrays.compare(b1, b2);
        System.out.println(cmp);

        // 5. sort()
        int[] unsorted = {5, 3, 1, 4, 2};
        Arrays.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
    }
}

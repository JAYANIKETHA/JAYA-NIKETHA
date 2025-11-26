package nov25;
import java.util.Arrays;

public class arraymethods {

	public static void main(String[] args) {

	       
        int arr[] = {5, 2, 8, 1, 9};

        System.out.println("Array length: " + arr.length);

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled: " + Arrays.toString(filled));

        int[] copy1 = Arrays.copyOf(arr, 3);
        System.out.println("CopyOf: " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Copy Range: " + Arrays.toString(copy2));

        System.out.println("Arrays Equals: " + Arrays.equals(arr, copy1));

        System.out.println("Binary Search (8): " + Arrays.binarySearch(arr, 8));

        System.out.println("ToString: " + Arrays.toString(arr));

        int[] newArr = new int[5];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println("System.arraycopy: " + Arrays.toString(newArr));

        System.out.println("Arrays.asList: " + Arrays.asList("A", "B", "C"));
    }
}

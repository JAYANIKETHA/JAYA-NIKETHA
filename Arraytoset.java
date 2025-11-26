package nov25;
import java.util.HashSet;
import java.util.Set;

public class convertthearrayintoset {

	public static void main(String[] args) {

         int[] arr = {1, 2, 3, 4, 5, 3, 1};

        Set<Integer> set = new HashSet<>();

        // Convert array to set manually
        for (int value : arr) {
            set.add(value);
        }

        System.out.println("Set: " + set);
    }
}
	



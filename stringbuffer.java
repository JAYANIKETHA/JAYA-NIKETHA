package nov25;

public class stringbuffer {

	public static void main(String[] args) {

        StringBuilder sb2 = new StringBuilder("ABCDE");

        System.out.println("Append: " + sb2.append("123"));
        System.out.println("Insert: " + sb2.insert(3, "---"));
        System.out.println("Delete: " + sb2.delete(2, 5));
        System.out.println("Replace: " + sb2.replace(1, 3, "XYZ"));
        System.out.println("Reverse: " + sb2.reverse());
        System.out.println("Capacity: " + sb2.capacity());

        sb2.setCharAt(0, 'Q');
        System.out.println("setCharAt: " + sb2);
    }
}


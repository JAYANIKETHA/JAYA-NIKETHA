package nov21;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();
            System.out.println("You entered: " + x);
            System.out.print("Enter number to divide 100: ");
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
        finally {
            System.out.println("Thank you for your answer!!!");
        }
    }
}

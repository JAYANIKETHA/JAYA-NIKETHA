package nov21;
public class Constructors {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        Calculator b = new Calculator(14);
        Calculator c = new Calculator(14, 1);
        c.showResult();
    }
}
class Calculator {
    int num1, num2;
    Calculator() {
        System.out.println("Default Constructor");
    }
    Calculator(int x) {
        num1 = x;
        System.out.println("Value: " + num1);
    }
    Calculator(int x, int y) {
        num1 = x;
        num2 = y;
        System.out.println("Sum: " + (num1 + num2));
    }
    void showResult() {
        System.out.println("num1 + num2 = " + (num1 + num2));
    }
}

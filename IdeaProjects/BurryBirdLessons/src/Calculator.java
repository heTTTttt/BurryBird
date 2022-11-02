import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.division();
        calculate.multiplication();
        calculate.minus();
        calculate.plus();

    }
}

class Calculate {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    void plus() {
        System.out.println(a + b);
    }

    void minus() {
        System.out.println(a - b);
    }

    void division() {
        System.out.println(a / b);
    }

    void multiplication() {
        System.out.println(a * b);
    }
}
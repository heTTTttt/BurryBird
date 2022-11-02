import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод текста");
        String string = scanner.nextLine();
        System.out.println("вы ввели "+string);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ввод числа");
        int x = scanner1.nextInt();
        System.out.println("вы ввели "+x);
    }
}


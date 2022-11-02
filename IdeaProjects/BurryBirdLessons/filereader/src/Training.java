import java.util.Random;
import java.util.Scanner;

public class Training {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(1000);
        int value = scanner.nextInt();
        if (value > a){
            System.out.println(value+ ">" +a);
        }else if (value < a){
            System.out.println(value+ "<" +a);
        }else {
            System.out.println(value+"="+a);
        }

    }
}

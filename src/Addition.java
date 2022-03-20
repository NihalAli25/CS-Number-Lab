
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double num1 = key.nextDouble();
        double num2 = key.nextDouble();

        System.out.println("Total: " + num1 + num2);
    }
}

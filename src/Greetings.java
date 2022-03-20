import java.sql.SQLOutput;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String name = key.next();

        System.out.println("Greetings " + name);
    }
}

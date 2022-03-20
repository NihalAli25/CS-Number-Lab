import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double side = key.nextDouble();

        System.out.println("Perimeter of square: " + (4 * side));
    }
}

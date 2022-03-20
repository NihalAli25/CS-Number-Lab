import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double length = key.nextDouble();
        double width = key.nextDouble();

        System.out.println("Perimeter Of rectangle: " + (2 * (length + width)));
    }
}

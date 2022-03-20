import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double radius = key.nextDouble();

        System.out.println("Perimeter of circle: "  + (2 * 3.142 * radius));
    }
}

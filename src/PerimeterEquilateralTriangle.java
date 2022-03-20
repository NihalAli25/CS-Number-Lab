import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double side = key.nextDouble();

        System.out.println("Perimeter of equilateral triangle: " + (3 * side));
    }
}

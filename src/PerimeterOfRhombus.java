import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double side = key.nextDouble();

        System.out.println("Perimeter of rhombus: " + (4 * side));
    }
}

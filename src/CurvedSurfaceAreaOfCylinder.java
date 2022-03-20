import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double r = key.nextDouble();
        double h = key.nextDouble();

        System.out.println("Curved surface area of cylinder: " + 2 * 3.142 * r * h);
    }
}
